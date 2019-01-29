package com.devonfw.application.prcr.tareasmanagement.logic.impl.usecase;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.devonfw.application.prcr.tareasmanagement.logic.api.to.TareaEto;
import com.devonfw.application.prcr.tareasmanagement.logic.api.usecase.UcFindTarea;
import com.devonfw.application.prcr.tareasmanagement.logic.api.usecase.UcManagementTarea;
import com.devonfw.application.prcr.tareasmanagement.logic.base.usecase.AbstractTareaUc;

public class UcManagementTareaImpl extends AbstractTareaUc implements UcManagementTarea{



	@Inject
	private UcFindTarea uCfindTarea;

	private static final Logger LOG = LoggerFactory.getLogger(UcManagementTarea.class);

	@Override
	public Boolean deleteTarea(Long id) {
		TareaEto tareaEto = getUcFindTarea().findTareaEto(id);
		Long idTareaBorrar = tareaEto.getId();
		getTareaRepository().deleteById(idTareaBorrar);

		LOG.debug("Tarea borrada");

		return true;
	}




	public UcFindTarea getUcFindTarea() {
		return this.uCfindTarea;
	}

}
