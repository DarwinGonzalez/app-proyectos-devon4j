package com.devonfw.application.prcr.tareasmanagement.logic.api.usecase;

import java.util.List;

import org.springframework.data.domain.Page;

import com.devonfw.application.prcr.tareasmanagement.logic.api.to.TareaCto;
import com.devonfw.application.prcr.tareasmanagement.logic.api.to.TareaSearchCriteriaTo;

public interface UcFindTarea {

	/**
	 * Returns a composite Tarea by its id 'id'.
	 *
	 * @param id The id 'id' of the Tarea.
	 * @return The {@link TareaCto} with id 'id'
	 */
	TareaCto findTareaCto(long id);

	/**
	 * Returns a paginated list of composite Tareas matching the search criteria.
	 *
	 * @param criteria the {@link TareaSearchCriteriaTo}.
	 * @return the {@link List} of matching {@link TareaCto}s.
	 */
	Page<TareaCto> findTareaCtos(TareaSearchCriteriaTo criteria);

}
