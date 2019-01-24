package com.devonfw.application.prcr.proyectosmanagement.logic.base.usecase;

import javax.inject.Inject;

import com.devonfw.application.prcr.general.logic.base.AbstractUc;
import com.devonfw.application.prcr.proyectosmanagement.dataaccess.api.repo.ProyectoRepository;

/**
 * Abstract use case for Proyectos, which provides access to the commonly
 * necessary data access objects.
 */
public class AbstractProyectoUc extends AbstractUc {

	/** @see #getProyectoRepository() */
	@Inject
	private ProyectoRepository proyectoRepository;

	/**
	 * Returns the field 'proyectoRepository'.
	 * 
	 * @return the {@link ProyectoRepository} instance.
	 */
	public ProyectoRepository getProyectoRepository() {

		return this.proyectoRepository;
	}

}
