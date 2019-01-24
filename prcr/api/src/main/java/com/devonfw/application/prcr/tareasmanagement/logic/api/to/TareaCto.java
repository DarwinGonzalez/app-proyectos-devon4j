package com.devonfw.application.prcr.tareasmanagement.logic.api.to;

import com.devonfw.application.prcr.proyectosmanagement.logic.api.to.ProyectoEto;
import com.devonfw.application.prcr.usermanagement.logic.api.to.UserEto;
import com.devonfw.module.basic.common.api.to.AbstractCto;

/**
 * Composite transport object of Tarea
 */
public class TareaCto extends AbstractCto {

	private static final long serialVersionUID = 1L;

	private TareaEto tarea;

	private ProyectoEto pr_id;

	private UserEto username;

	public TareaEto getTarea() {
		return tarea;
	}

	public void setTarea(TareaEto tarea) {
		this.tarea = tarea;
	}

	public ProyectoEto getPr_id() {
		return pr_id;
	}

	public void setPr_id(ProyectoEto pr_id) {
		this.pr_id = pr_id;
	}

	public UserEto getUsername() {
		return username;
	}

	public void setUsername(UserEto username) {
		this.username = username;
	}

}
