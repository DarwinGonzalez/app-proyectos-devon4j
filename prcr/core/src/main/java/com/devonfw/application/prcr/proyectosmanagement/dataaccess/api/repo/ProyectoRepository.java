package com.devonfw.application.prcr.proyectosmanagement.dataaccess.api.repo;

import static com.querydsl.core.alias.Alias.$;

import java.util.Iterator;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import com.devonfw.application.prcr.proyectosmanagement.dataaccess.api.ProyectoEntity;
import com.devonfw.application.prcr.proyectosmanagement.logic.api.to.ProyectoSearchCriteriaTo;
import com.devonfw.module.jpa.dataaccess.api.QueryUtil;
import com.devonfw.module.jpa.dataaccess.api.data.DefaultRepository;
import com.querydsl.jpa.impl.JPAQuery;

/**
 * {@link DefaultRepository} for {@link ProyectoEntity}
 */
public interface ProyectoRepository extends DefaultRepository<ProyectoEntity> {

	/**
	 * @param criteria    the {@link ProyectoSearchCriteriaTo} with the criteria to
	 *                    search.
	 * @param pageRequest {@link Pageable} implementation used to set page
	 *                    properties like page size
	 * @return the {@link Page} of the {@link ProyectoEntity} objects that matched
	 *         the search.
	 */
	default Page<ProyectoEntity> findByCriteria(ProyectoSearchCriteriaTo criteria) {

		ProyectoEntity alias = newDslAlias();
		JPAQuery<ProyectoEntity> query = newDslQuery(alias);

		String nombre = criteria.getNombre();
		if (nombre != null && !nombre.isEmpty()) {
			QueryUtil.get().whereString(query, $(alias.getNombre()), nombre, criteria.getNombreOption());
		}
		addOrderBy(query, alias, criteria.getPageable().getSort());

		return QueryUtil.get().findPaginated(criteria.getPageable(), query, true);
	}

	/**
	 * Add sorting to the given query on the given alias
	 * 
	 * @param query to add sorting to
	 * @param alias to retrieve columns from for sorting
	 * @param sort  specification of sorting
	 */
	public default void addOrderBy(JPAQuery<ProyectoEntity> query, ProyectoEntity alias, Sort sort) {
		if (sort != null && sort.isSorted()) {
			Iterator<Order> it = sort.iterator();
			while (it.hasNext()) {
				Order next = it.next();
				switch (next.getProperty()) {
				case "nombre":
					if (next.isAscending()) {
						query.orderBy($(alias.getNombre()).asc());
					} else {
						query.orderBy($(alias.getNombre()).desc());
					}
					break;
				default:
					throw new IllegalArgumentException("Sorted by the unknown property '" + next.getProperty() + "'");
				}
			}
		}
	}

}