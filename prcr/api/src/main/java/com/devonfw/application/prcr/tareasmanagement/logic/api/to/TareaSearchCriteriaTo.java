package com.devonfw.application.prcr.tareasmanagement.logic.api.to;

import java.time.LocalDate;

import com.devonfw.application.prcr.general.common.api.to.AbstractSearchCriteriaTo;
import com.devonfw.module.basic.common.api.query.StringSearchConfigTo;

/**
 * {@link SearchCriteriaTo} to find instances of
 * {@link com.devonfw.application.prcr.tareasmanagement.common.api.Tarea}s.
 */
public class TareaSearchCriteriaTo extends AbstractSearchCriteriaTo {

	private static final long serialVersionUID = 1L;

	private String nombre;

	private Long pr_idId;

	private LocalDate fechalimite;

	private Long usernameId;

	private LocalDate fechafinalizacion;

	private StringSearchConfigTo nombreOption;

	/**
	 * @return nombreId
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre setter for nombre attribute
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * getter for pr_idId attribute
	 *
	 * @return pr_idId
	 */
	public Long getPr_idId() {
		return pr_idId;
	}

	/**
	 * @param pr_id setter for pr_id attribute
	 */
	public void setPr_idId(Long pr_idId) {
		this.pr_idId = pr_idId;
	}

	/**
	 * @return fechalimiteId
	 */
	public LocalDate getFechalimite() {
		return fechalimite;
	}

	/**
	 * @param fechalimite setter for fechalimite attribute
	 */
	public void setFechalimite(LocalDate fechalimite) {
		this.fechalimite = fechalimite;
	}

	/**
	 * getter for usernameId attribute
	 *
	 * @return usernameId
	 */
	public Long getUsernameId() {
		return usernameId;
	}

	/**
	 * @param username setter for username attribute
	 */
	public void setUsernameId(Long usernameId) {
		this.usernameId = usernameId;
	}

	/**
	 * @return fechafinalizacionId
	 */
	public LocalDate getFechafinalizacion() {
		return fechafinalizacion;
	}

	/**
	 * @param fechafinalizacion setter for fechafinalizacion attribute
	 */
	public void setFechafinalizacion(LocalDate fechafinalizacion) {
		this.fechafinalizacion = fechafinalizacion;
	}

	/**
	 * @return the {@link StringSearchConfigTo} used to search for
	 *         {@link #getNombre() nombre}.
	 */
	public StringSearchConfigTo getNombreOption() {

		return this.nombreOption;
	}

	/**
	 * @param nombreOption new value of {@link #getNombreOption()}.
	 */
	public void setNombreOption(StringSearchConfigTo nombreOption) {

		this.nombreOption = nombreOption;
	}

}
