package com.devonfw.application.prcr.usermanagement.common.api;

import com.devonfw.application.prcr.general.common.api.ApplicationEntity;

public interface User extends ApplicationEntity {

	/**
	 * @return usernameId
	 */

	public String getUsername();

	/**
	 * @param username setter for username attribute
	 */

	public void setUsername(String username);

	/**
	 * @return roleId
	 */

	public String getRole();

	/**
	 * @param role setter for role attribute
	 */

	public void setRole(String role);

	/**
	 * @return passwordId
	 */

	public String getPassword();

	/**
	 * @param password setter for password attribute
	 */

	public void setPassword(String password);

}
