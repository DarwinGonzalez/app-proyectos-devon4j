package com.devonfw.application.prcr.tareasmanagement.logic.api.usecase;

import com.devonfw.application.prcr.tareasmanagement.logic.api.to.TareaEto;

public interface UcManageTarea {

	/**
	 * Deletes a tarea from the database by its id 'tareaId'.
	 *
	 * @param tareaId Id of the tarea to delete
	 * @return boolean <code>true</code> if the tarea can be deleted,
	 *         <code>false</code> otherwise
	 */

	Boolean deleteTarea(long tareaId);

	/**
	 * Saves a tarea and store it in the database.
	 * @param tarea the {@link TareaEto} to create.
	 * @return the new {@link TareaEto} that has been saved with ID and version.
	 */

	TareaEto saveTarea(TareaEto tareaEto);

}
