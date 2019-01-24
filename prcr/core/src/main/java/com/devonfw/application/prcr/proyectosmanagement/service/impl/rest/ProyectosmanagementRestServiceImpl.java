package com.devonfw.application.prcr.proyectosmanagement.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.application.prcr.proyectosmanagement.logic.api.Proyectosmanagement;
import com.devonfw.application.prcr.proyectosmanagement.logic.api.to.ProyectoEto;
import com.devonfw.application.prcr.proyectosmanagement.logic.api.to.ProyectoSearchCriteriaTo;
import com.devonfw.application.prcr.proyectosmanagement.service.api.rest.ProyectosmanagementRestService;

/**
 * The service implementation for REST calls in order to execute the logic of
 * component {@link Proyectosmanagement}.
 */
@Named("ProyectosmanagementRestService")
public class ProyectosmanagementRestServiceImpl implements ProyectosmanagementRestService {

	@Inject
	private Proyectosmanagement proyectosmanagement;

	@Override
	public ProyectoEto getProyecto(long id) {
		return this.proyectosmanagement.findProyecto(id);
	}

	@Override
	public ProyectoEto saveProyecto(ProyectoEto proyecto) {
		return this.proyectosmanagement.saveProyecto(proyecto);
	}

	@Override
	public void deleteProyecto(long id) {
		this.proyectosmanagement.deleteProyecto(id);
	}

	@Override
	public Page<ProyectoEto> findProyectos(ProyectoSearchCriteriaTo searchCriteriaTo) {
		return this.proyectosmanagement.findProyectos(searchCriteriaTo);
	}
}