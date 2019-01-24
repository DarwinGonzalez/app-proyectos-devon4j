package com.devonfw.application.prcr.proyectosmanagement.logic.api.usecase;

import com.devonfw.application.prcr.proyectosmanagement.logic.api.to.ProyectoEto;

/**
 * Interface of UcManageProyecto to centralize documentation and signatures of
 * methods.
 */
public interface UcManageProyecto {

	/**
	 * Deletes a proyecto from the database by its id 'proyectoId'.
	 *
	 * @param proyectoId Id of the proyecto to delete
	 * @return boolean <code>true</code> if the proyecto can be deleted,
	 *         <code>false</code> otherwise
	 */
	boolean deleteProyecto(long proyectoId);

	/**
	 * Saves a proyecto and store it in the database.
	 *
	 * @param proyecto the {@link ProyectoEto} to create.
	 * @return the new {@link ProyectoEto} that has been saved with ID and version.
	 */
	ProyectoEto saveProyecto(ProyectoEto proyecto);

}
