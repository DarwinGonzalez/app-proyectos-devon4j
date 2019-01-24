package com.devonfw.application.prcr.proyectosmanagement.logic.impl.usecase;

import java.util.Objects;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devonfw.application.prcr.proyectosmanagement.dataaccess.api.ProyectoEntity;
import com.devonfw.application.prcr.proyectosmanagement.logic.api.to.ProyectoEto;
import com.devonfw.application.prcr.proyectosmanagement.logic.api.usecase.UcManageProyecto;
import com.devonfw.application.prcr.proyectosmanagement.logic.base.usecase.AbstractProyectoUc;

/**
 * Use case implementation for modifying and deleting Proyectos
 */
@Named
@Validated
@Transactional
public class UcManageProyectoImpl extends AbstractProyectoUc implements UcManageProyecto {

	/** Logger instance. */
	private static final Logger LOG = LoggerFactory.getLogger(UcManageProyectoImpl.class);

	@Override
	public boolean deleteProyecto(long proyectoId) {

		ProyectoEntity proyecto = getProyectoRepository().find(proyectoId);
		getProyectoRepository().delete(proyecto);
		LOG.debug("The proyecto with id '{}' has been deleted.", proyectoId);
		return true;
	}

	@Override
	public ProyectoEto saveProyecto(ProyectoEto proyecto) {

		Objects.requireNonNull(proyecto, "proyecto");

		ProyectoEntity proyectoEntity = getBeanMapper().map(proyecto, ProyectoEntity.class);

		// initialize, validate proyectoEntity here if necessary
		ProyectoEntity resultEntity = getProyectoRepository().save(proyectoEntity);
		LOG.debug("Proyecto with id '{}' has been created.", resultEntity.getId());
		return getBeanMapper().map(resultEntity, ProyectoEto.class);
	}
}
