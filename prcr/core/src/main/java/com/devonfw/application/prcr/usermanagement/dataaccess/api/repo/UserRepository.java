package com.devonfw.application.prcr.usermanagement.dataaccess.api.repo;

import static com.querydsl.core.alias.Alias.$;

import java.util.Iterator;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import com.devonfw.application.prcr.usermanagement.dataaccess.api.UserEntity;
import com.devonfw.application.prcr.usermanagement.logic.api.to.UserSearchCriteriaTo;
import com.devonfw.module.jpa.dataaccess.api.QueryUtil;
import com.devonfw.module.jpa.dataaccess.api.data.DefaultRepository;
import com.querydsl.jpa.impl.JPAQuery;

/**
 * {@link DefaultRepository} for {@link UserEntity}
 */
public interface UserRepository extends DefaultRepository<UserEntity> {

	/**
	 * @param criteria    the {@link UserSearchCriteriaTo} with the criteria to
	 *                    search.
	 * @param pageRequest {@link Pageable} implementation used to set page
	 *                    properties like page size
	 * @return the {@link Page} of the {@link UserEntity} objects that matched the
	 *         search.
	 */
	default Page<UserEntity> findByCriteria(UserSearchCriteriaTo criteria) {

		UserEntity alias = newDslAlias();
		JPAQuery<UserEntity> query = newDslQuery(alias);

		String username = criteria.getUsername();
		if (username != null && !username.isEmpty()) {
			QueryUtil.get().whereString(query, $(alias.getUsername()), username, criteria.getUsernameOption());
		}
		String role = criteria.getRole();
		if (role != null && !role.isEmpty()) {
			QueryUtil.get().whereString(query, $(alias.getRole()), role, criteria.getRoleOption());
		}
		String password = criteria.getPassword();
		if (password != null && !password.isEmpty()) {
			QueryUtil.get().whereString(query, $(alias.getPassword()), password, criteria.getPasswordOption());
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
	public default void addOrderBy(JPAQuery<UserEntity> query, UserEntity alias, Sort sort) {
		if (sort != null && sort.isSorted()) {
			Iterator<Order> it = sort.iterator();
			while (it.hasNext()) {
				Order next = it.next();
				switch (next.getProperty()) {
				case "username":
					if (next.isAscending()) {
						query.orderBy($(alias.getUsername()).asc());
					} else {
						query.orderBy($(alias.getUsername()).desc());
					}
					break;
				case "role":
					if (next.isAscending()) {
						query.orderBy($(alias.getRole()).asc());
					} else {
						query.orderBy($(alias.getRole()).desc());
					}
					break;
				case "password":
					if (next.isAscending()) {
						query.orderBy($(alias.getPassword()).asc());
					} else {
						query.orderBy($(alias.getPassword()).desc());
					}
					break;
				default:
					throw new IllegalArgumentException("Sorted by the unknown property '" + next.getProperty() + "'");
				}
			}
		}
	}

}