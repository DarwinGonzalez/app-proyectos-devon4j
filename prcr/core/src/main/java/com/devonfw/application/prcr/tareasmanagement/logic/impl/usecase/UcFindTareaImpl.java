package com.devonfw.application.prcr.tareasmanagement.logic.impl.usecase;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devonfw.application.prcr.proyectosmanagement.logic.api.to.ProyectoEto;
import com.devonfw.application.prcr.tareasmanagement.dataaccess.api.TareaEntity;
import com.devonfw.application.prcr.tareasmanagement.logic.api.to.TareaCto;
import com.devonfw.application.prcr.tareasmanagement.logic.api.to.TareaEto;
import com.devonfw.application.prcr.tareasmanagement.logic.api.to.TareaSearchCriteriaTo;
import com.devonfw.application.prcr.tareasmanagement.logic.api.usecase.UcFindTarea;
import com.devonfw.application.prcr.tareasmanagement.logic.base.usecase.AbstractTareaUc;
import com.devonfw.application.prcr.usermanagement.logic.api.to.UserEto;

/**
 * Use case implementation for searching, filtering and getting Tareas
 */
@Named
@Validated
@Transactional
public class UcFindTareaImpl extends AbstractTareaUc implements UcFindTarea {

	/** Logger instance. */
	private static final Logger LOG = LoggerFactory.getLogger(UcFindTareaImpl.class);

	@Override
	public TareaCto findTareaCto(long id) {
		LOG.debug("Get TareaCto with id {} from database.", id);
		TareaEntity entity = getTareaRepository().find(id);
		TareaCto cto = new TareaCto();
		cto.setTarea(getBeanMapper().map(entity, TareaEto.class));
		cto.setPr_id(getBeanMapper().map(entity.getPr_id(), ProyectoEto.class));
		cto.setUsername(getBeanMapper().map(entity.getUsername(), UserEto.class));

		return cto;
	}

	@Override
	public Page<TareaCto> findTareaCtos(TareaSearchCriteriaTo criteria) {

		Page<TareaEntity> tareas = getTareaRepository().findByCriteria(criteria);
		List<TareaCto> ctos = new ArrayList<>();
		for (TareaEntity entity : tareas.getContent()) {
			TareaCto cto = new TareaCto();
			cto.setTarea(getBeanMapper().map(entity, TareaEto.class));
			cto.setPr_id(getBeanMapper().map(entity.getPr_id(), ProyectoEto.class));
			cto.setUsername(getBeanMapper().map(entity.getUsername(), UserEto.class));
			ctos.add(cto);
		}
		Pageable pagResultTo = PageRequest.of(criteria.getPageable().getPageNumber(),
				criteria.getPageable().getPageSize());

		return new PageImpl<>(ctos, pagResultTo, tareas.getTotalElements());
	}
}
