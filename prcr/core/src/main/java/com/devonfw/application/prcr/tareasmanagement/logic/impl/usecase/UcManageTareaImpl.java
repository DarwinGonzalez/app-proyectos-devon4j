package com.devonfw.application.prcr.tareasmanagement.logic.impl.usecase;

import java.util.Objects;

import javax.inject.Inject;

import com.devonfw.application.prcr.tareasmanagement.dataaccess.api.TareaEntity;
import com.devonfw.application.prcr.tareasmanagement.logic.api.to.TareaCto;
import com.devonfw.application.prcr.tareasmanagement.logic.api.to.TareaEto;
import com.devonfw.application.prcr.tareasmanagement.logic.api.usecase.UcManageTarea;
import com.devonfw.application.prcr.tareasmanagement.logic.base.usecase.AbstractTareaUc;

public class UcManageTareaImpl extends AbstractTareaUc implements UcManageTarea {

	@Inject
	private UcFindTareaImpl ucFindTareaImpl ;

	@Override
	public Boolean deleteTarea(long proyectoId) {

		// TareaCto tareaCto = getUcFindTarea().findTareaCto(tareaId);
		// TareaEntity tareaEntity = getBeanMapper().map(tareaCto.getTarea(), TareaEntity.class);

		getTareaRepository().deleteByProyectoEntity_id(proyectoId);
		return true;
	}

	@Override
	public TareaEto saveTarea(TareaEto tareaEto) {
		return null;
	}

	public UcFindTareaImpl getUcFindTarea() {
		return ucFindTareaImpl;
	}

}
