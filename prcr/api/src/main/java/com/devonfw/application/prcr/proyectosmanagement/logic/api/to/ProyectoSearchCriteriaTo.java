package com.devonfw.application.prcr.proyectosmanagement.logic.api.to;

import com.devonfw.application.prcr.general.common.api.to.AbstractSearchCriteriaTo;
import com.devonfw.module.basic.common.api.query.StringSearchConfigTo;

/**
 * {@link SearchCriteriaTo} to find instances of
 * {@link com.devonfw.application.prcr.proyectosmanagement.common.api.Proyecto}s.
 */
public class ProyectoSearchCriteriaTo extends AbstractSearchCriteriaTo {

	private static final long serialVersionUID = 1L;

	private String nombre;
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
