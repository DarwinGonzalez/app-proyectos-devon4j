package com.devonfw.application.prcr.usermanagement.logic.api.to;

import com.devonfw.application.prcr.general.common.api.to.AbstractSearchCriteriaTo;
import com.devonfw.module.basic.common.api.query.StringSearchConfigTo;

/**
 * {@link SearchCriteriaTo} to find instances of
 * {@link com.devonfw.application.prcr.usermanagement.common.api.User}s.
 */
public class UserSearchCriteriaTo extends AbstractSearchCriteriaTo {

	private static final long serialVersionUID = 1L;

	private String username;
	private String role;
	private String password;
	private StringSearchConfigTo usernameOption;
	private StringSearchConfigTo roleOption;
	private StringSearchConfigTo passwordOption;

	/**
	 * @return usernameId
	 */

	public String getUsername() {
		return username;
	}

	/**
	 * @param username setter for username attribute
	 */

	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return roleId
	 */

	public String getRole() {
		return role;
	}

	/**
	 * @param role setter for role attribute
	 */

	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return passwordId
	 */

	public String getPassword() {
		return password;
	}

	/**
	 * @param password setter for password attribute
	 */

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the {@link StringSearchConfigTo} used to search for
	 *         {@link #getUsername() username}.
	 */
	public StringSearchConfigTo getUsernameOption() {

		return this.usernameOption;
	}

	/**
	 * @param usernameOption new value of {@link #getUsernameOption()}.
	 */
	public void setUsernameOption(StringSearchConfigTo usernameOption) {

		this.usernameOption = usernameOption;
	}

	/**
	 * @return the {@link StringSearchConfigTo} used to search for {@link #getRole()
	 *         role}.
	 */
	public StringSearchConfigTo getRoleOption() {

		return this.roleOption;
	}

	/**
	 * @param roleOption new value of {@link #getRoleOption()}.
	 */
	public void setRoleOption(StringSearchConfigTo roleOption) {

		this.roleOption = roleOption;
	}

	/**
	 * @return the {@link StringSearchConfigTo} used to search for
	 *         {@link #getPassword() password}.
	 */
	public StringSearchConfigTo getPasswordOption() {

		return this.passwordOption;
	}

	/**
	 * @param passwordOption new value of {@link #getPasswordOption()}.
	 */
	public void setPasswordOption(StringSearchConfigTo passwordOption) {

		this.passwordOption = passwordOption;
	}

}
