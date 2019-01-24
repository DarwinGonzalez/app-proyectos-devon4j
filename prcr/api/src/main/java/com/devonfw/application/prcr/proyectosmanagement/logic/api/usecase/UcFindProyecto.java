package com.devonfw.application.prcr.proyectosmanagement.logic.api.usecase;

import java.util.List;

import org.springframework.data.domain.Page;

import com.devonfw.application.prcr.proyectosmanagement.logic.api.to.ProyectoEto;
import com.devonfw.application.prcr.proyectosmanagement.logic.api.to.ProyectoSearchCriteriaTo;

public interface UcFindProyecto {

	/**
	 * Returns a Proyecto by its id 'id'.
	 *
	 * @param id The id 'id' of the Proyecto.
	 * @return The {@link ProyectoEto} with id 'id'
	 */
	ProyectoEto findProyecto(long id);

	/**
	 * Returns a paginated list of Proyectos matching the search criteria.
	 *
	 * @param criteria the {@link ProyectoSearchCriteriaTo}.
	 * @return the {@link List} of matching {@link ProyectoEto}s.
	 */
	Page<ProyectoEto> findProyectos(ProyectoSearchCriteriaTo criteria);

}
