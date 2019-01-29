package com.devonfw.application.prcr.tareasmanagement.logic.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.application.prcr.general.logic.base.AbstractComponentFacade;
import com.devonfw.application.prcr.tareasmanagement.logic.api.Tareasmanagement;
import com.devonfw.application.prcr.tareasmanagement.logic.api.to.TareaCto;
import com.devonfw.application.prcr.tareasmanagement.logic.api.to.TareaEto;
import com.devonfw.application.prcr.tareasmanagement.logic.api.to.TareaSearchCriteriaTo;
import com.devonfw.application.prcr.tareasmanagement.logic.api.usecase.UcFindTarea;

/**
 * Implementation of component interface of tareasmanagement
 */
@Named
public class TareasmanagementImpl extends AbstractComponentFacade implements Tareasmanagement {

	@Inject
	private UcFindTarea ucFindTarea;

	@Override
	public TareaCto findTareaCto(long id) {

		return ucFindTarea.findTareaCto(id);
	}

	@Override
	public Page<TareaCto> findTareaCtos(TareaSearchCriteriaTo criteria) {

		return ucFindTarea.findTareaCtos(criteria);
	}

	@Override
	public TareaEto findTareaEto(long id) {
		return ucFindTarea.findTareaEto(id);
	}
}
