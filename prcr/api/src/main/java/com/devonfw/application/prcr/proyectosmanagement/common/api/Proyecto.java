package com.devonfw.application.prcr.proyectosmanagement.common.api;

import com.devonfw.application.prcr.general.common.api.ApplicationEntity;

public interface Proyecto extends ApplicationEntity {

	/**
	 * @return nombreId
	 */

	public String getNombre();

	/**
	 * @param nombre setter for nombre attribute
	 */

	public void setNombre(String nombre);

}
