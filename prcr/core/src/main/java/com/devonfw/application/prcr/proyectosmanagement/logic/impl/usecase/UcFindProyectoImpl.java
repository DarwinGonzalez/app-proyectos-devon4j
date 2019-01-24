package com.devonfw.application.prcr.proyectosmanagement.logic.impl.usecase;

import java.util.Optional;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devonfw.application.prcr.proyectosmanagement.dataaccess.api.ProyectoEntity;
import com.devonfw.application.prcr.proyectosmanagement.logic.api.to.ProyectoEto;
import com.devonfw.application.prcr.proyectosmanagement.logic.api.to.ProyectoSearchCriteriaTo;
import com.devonfw.application.prcr.proyectosmanagement.logic.api.usecase.UcFindProyecto;
import com.devonfw.application.prcr.proyectosmanagement.logic.base.usecase.AbstractProyectoUc;

/**
 * Use case implementation for searching, filtering and getting Proyectos
 */
@Named
@Validated
@Transactional
public class UcFindProyectoImpl extends AbstractProyectoUc implements UcFindProyecto {

	/** Logger instance. */
	private static final Logger LOG = LoggerFactory.getLogger(UcFindProyectoImpl.class);

	@Override
	public ProyectoEto findProyecto(long id) {
		LOG.debug("Get Proyecto with id {} from database.", id);
		Optional<ProyectoEntity> foundEntity = getProyectoRepository().findById(id);
		if (foundEntity.isPresent())
			return getBeanMapper().map(foundEntity.get(), ProyectoEto.class);
		else
			return null;
	}

	@Override
	public Page<ProyectoEto> findProyectos(ProyectoSearchCriteriaTo criteria) {
		Page<ProyectoEntity> proyectos = getProyectoRepository().findByCriteria(criteria);
		return mapPaginatedEntityList(proyectos, ProyectoEto.class);
	}

}
