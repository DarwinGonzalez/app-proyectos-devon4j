package com.devonfw.application.prcr.tareasmanagement.dataaccess.api.repo;

import static com.querydsl.core.alias.Alias.$;

import java.time.LocalDate;
import java.util.Iterator;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import com.devonfw.application.prcr.tareasmanagement.dataaccess.api.TareaEntity;
import com.devonfw.application.prcr.tareasmanagement.logic.api.to.TareaSearchCriteriaTo;
import com.devonfw.module.jpa.dataaccess.api.QueryUtil;
import com.devonfw.module.jpa.dataaccess.api.data.DefaultRepository;
import com.querydsl.jpa.impl.JPAQuery;

/**
 * {@link DefaultRepository} for {@link TareaEntity}
 */
public interface TareaRepository extends DefaultRepository<TareaEntity> {

	/**
	 * @param criteria    the {@link TareaSearchCriteriaTo} with the criteria to
	 *                    search.
	 * @param pageRequest {@link Pageable} implementation used to set page
	 *                    properties like page size
	 * @return the {@link Page} of the {@link TareaEntity} objects that matched the
	 *         search.
	 */
	default Page<TareaEntity> findByCriteria(TareaSearchCriteriaTo criteria) {

		TareaEntity alias = newDslAlias();
		JPAQuery<TareaEntity> query = newDslQuery(alias);

		String nombre = criteria.getNombre();
		if (nombre != null && !nombre.isEmpty()) {
			QueryUtil.get().whereString(query, $(alias.getNombre()), nombre, criteria.getNombreOption());
		}
		Long pr_id = criteria.getPr_idId();
		if (pr_id != null) {
			query.where($(alias.getPr_id().getId()).eq(pr_id));
		}
		LocalDate fechalimite = criteria.getFechalimite();
		if (fechalimite != null) {
			query.where($(alias.getFechalimite()).eq(fechalimite));
		}
		Long username = criteria.getUsernameId();
		if (username != null) {
			query.where($(alias.getUsername().getId()).eq(username));
		}
		LocalDate fechafinalizacion = criteria.getFechafinalizacion();
		if (fechafinalizacion != null) {
			query.where($(alias.getFechafinalizacion()).eq(fechafinalizacion));
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
	public default void addOrderBy(JPAQuery<TareaEntity> query, TareaEntity alias, Sort sort) {
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
				case "pr_id":
					if (next.isAscending()) {
						query.orderBy($(alias.getPr_id().getId()).asc());
					} else {
						query.orderBy($(alias.getPr_id().getId()).desc());
					}
					break;
				case "fechalimite":
					if (next.isAscending()) {
						query.orderBy($(alias.getFechalimite()).asc());
					} else {
						query.orderBy($(alias.getFechalimite()).desc());
					}
					break;
				case "username":
					if (next.isAscending()) {
						query.orderBy($(alias.getUsername().getId()).asc());
					} else {
						query.orderBy($(alias.getUsername().getId()).desc());
					}
					break;
				case "fechafinalizacion":
					if (next.isAscending()) {
						query.orderBy($(alias.getFechafinalizacion()).asc());
					} else {
						query.orderBy($(alias.getFechafinalizacion()).desc());
					}
					break;
				default:
					throw new IllegalArgumentException("Sorted by the unknown property '" + next.getProperty() + "'");
				}
			}
		}
	}

	public void deleteByProyectoEntity_id(Long id);
}