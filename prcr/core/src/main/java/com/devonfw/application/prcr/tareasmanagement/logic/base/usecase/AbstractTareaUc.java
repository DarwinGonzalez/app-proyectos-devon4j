package com.devonfw.application.prcr.tareasmanagement.logic.base.usecase;

import javax.inject.Inject;

import com.devonfw.application.prcr.general.logic.base.AbstractUc;
import com.devonfw.application.prcr.tareasmanagement.dataaccess.api.repo.TareaRepository;

/**
 * Abstract use case for Tareas, which provides access to the commonly necessary
 * data access objects.
 */
public class AbstractTareaUc extends AbstractUc {

	/** @see #getTareaRepository() */
	@Inject
	private TareaRepository tareaRepository;

	/**
	 * Returns the field 'tareaRepository'.
	 * 
	 * @return the {@link TareaRepository} instance.
	 */
	public TareaRepository getTareaRepository() {

		return this.tareaRepository;
	}

}
