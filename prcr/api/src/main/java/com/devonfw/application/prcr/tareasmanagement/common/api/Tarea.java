package com.devonfw.application.prcr.tareasmanagement.common.api;

import java.time.LocalDate;

import com.devonfw.application.prcr.general.common.api.ApplicationEntity;

public interface Tarea extends ApplicationEntity {

	/**
	 * @return nombreId
	 */
	public String getNombre();

	/**
	 * @param nombre setter for nombre attribute
	 */
	public void setNombre(String nombre);

	/**
	 * getter for pr_idId attribute
	 *
	 * @return pr_idId
	 */
	public Long getPr_idId();

	/**
	 * @param pr_id setter for pr_id attribute
	 */
	public void setPr_idId(Long pr_idId);

	/**
	 * @return fechalimiteId
	 */
	public LocalDate getFechalimite();

	/**
	 * @param fechalimite setter for fechalimite attribute
	 */
	public void setFechalimite(LocalDate fechalimite);

	/**
	 * getter for usernameId attribute
	 *
	 * @return usernameId
	 */
	public Long getUsernameId();

	/**
	 * @param username setter for username attribute
	 */
	public void setUsernameId(Long usernameId);

	/**
	 * @return fechafinalizacionId
	 */
	public LocalDate getFechafinalizacion();

	/**
	 * @param fechafinalizacion setter for fechafinalizacion attribute
	 */
	public void setFechafinalizacion(LocalDate fechafinalizacion);

}
