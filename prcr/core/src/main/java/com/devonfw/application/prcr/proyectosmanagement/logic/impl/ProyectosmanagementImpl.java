package com.devonfw.application.prcr.proyectosmanagement.logic.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.application.prcr.general.logic.base.AbstractComponentFacade;
import com.devonfw.application.prcr.proyectosmanagement.logic.api.Proyectosmanagement;
import com.devonfw.application.prcr.proyectosmanagement.logic.api.to.ProyectoEto;
import com.devonfw.application.prcr.proyectosmanagement.logic.api.to.ProyectoSearchCriteriaTo;
import com.devonfw.application.prcr.proyectosmanagement.logic.api.usecase.UcFindProyecto;
import com.devonfw.application.prcr.proyectosmanagement.logic.api.usecase.UcManageProyecto;

/**
 * Implementation of component interface of proyectosmanagement
 */
@Named
public class ProyectosmanagementImpl extends AbstractComponentFacade implements Proyectosmanagement {

	@Inject
	private UcFindProyecto ucFindProyecto;

	@Inject
	private UcManageProyecto ucManageProyecto;

	@Override
	public ProyectoEto findProyecto(long id) {

		return this.ucFindProyecto.findProyecto(id);
	}

	@Override
	public Page<ProyectoEto> findProyectos(ProyectoSearchCriteriaTo criteria) {
		return this.ucFindProyecto.findProyectos(criteria);
	}

	@Override
	public ProyectoEto saveProyecto(ProyectoEto proyecto) {

		return this.ucManageProyecto.saveProyecto(proyecto);
	}

	@Override
	public boolean deleteProyecto(long id) {

		return this.ucManageProyecto.deleteProyecto(id);
	}
}
