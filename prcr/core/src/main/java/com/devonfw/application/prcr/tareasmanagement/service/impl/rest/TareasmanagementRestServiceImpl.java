package com.devonfw.application.prcr.tareasmanagement.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devonfw.application.prcr.tareasmanagement.logic.api.Tareasmanagement;
import com.devonfw.application.prcr.tareasmanagement.logic.api.to.TareaCto;
import com.devonfw.application.prcr.tareasmanagement.logic.api.to.TareaEto;
import com.devonfw.application.prcr.tareasmanagement.logic.api.to.TareaSearchCriteriaTo;
import com.devonfw.application.prcr.tareasmanagement.service.api.rest.TareasmanagementRestService;

/**
 * The service implementation for REST calls in order to execute the logic of
 * component {@link Tareasmanagement}.
 */
@Named("TareasmanagementRestService")
public class TareasmanagementRestServiceImpl implements TareasmanagementRestService {

	@Override
	public TareaEto getTareaEto(long id) {
		return this.tareasmanagement.findTareaEto(id);
	}

	@Inject
	private Tareasmanagement tareasmanagement;

	@Override
	public TareaCto getTareaCto(long id) {
		return this.tareasmanagement.findTareaCto(id);
	}

	@Override
	public Page<TareaCto> findTareaCtos(TareaSearchCriteriaTo searchCriteriaTo) {
		return this.tareasmanagement.findTareaCtos(searchCriteriaTo);
	}

	@Override
	public Page<TareaEto> findTareaEtos(TareaSearchCriteriaTo searchCriteriaTo) {
		return this.tareasmanagement.findTareaEtos(searchCriteriaTo);
	}

}