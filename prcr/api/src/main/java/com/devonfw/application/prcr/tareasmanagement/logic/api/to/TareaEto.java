package com.devonfw.application.prcr.tareasmanagement.logic.api.to;

import java.time.LocalDate;

import com.devonfw.application.prcr.tareasmanagement.common.api.Tarea;
import com.devonfw.module.basic.common.api.to.AbstractEto;

/**
 * Entity transport object of Tarea
 */
public class TareaEto extends AbstractEto implements Tarea {

	private static final long serialVersionUID = 1L;

	private String nombre;

	private Long pr_idId;

	private LocalDate fechalimite;

	private Long usernameId;

	private LocalDate fechafinalizacion;

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public Long getPr_idId() {
		return pr_idId;
	}

	@Override
	public void setPr_idId(Long pr_idId) {
		this.pr_idId = pr_idId;
	}


	public String getFechalimite() {
		if (fechalimite == null) {
			return null;
		} else {
			return fechalimite.toString();
		}

	}


	public void setFechalimite(LocalDate fechalimite) {
		this.fechalimite = fechalimite;
	}

	@Override
	public Long getUsernameId() {
		return usernameId;
	}

	@Override
	public void setUsernameId(Long usernameId) {
		this.usernameId = usernameId;
	}


	public String getFechafinalizacion() {
		if (fechafinalizacion == null) {
			return null;
		} else {
			return fechafinalizacion.toString();
		}

	}


	public void setFechafinalizacion(LocalDate fechafinalizacion) {
		this.fechafinalizacion = fechafinalizacion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((this.nombre == null) ? 0 : this.nombre.hashCode());

		result = prime * result + ((this.pr_idId == null) ? 0 : this.pr_idId.hashCode());
		result = prime * result + ((this.fechalimite == null) ? 0 : this.fechalimite.hashCode());

		result = prime * result + ((this.usernameId == null) ? 0 : this.usernameId.hashCode());
		result = prime * result + ((this.fechafinalizacion == null) ? 0 : this.fechafinalizacion.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		// class check will be done by super type EntityTo!
		if (!super.equals(obj)) {
			return false;
		}
		TareaEto other = (TareaEto) obj;
		if (this.nombre == null) {
			if (other.nombre != null) {
				return false;
			}
		} else if (!this.nombre.equals(other.nombre)) {
			return false;
		}

		if (this.pr_idId == null) {
			if (other.pr_idId != null) {
				return false;
			}
		} else if (!this.pr_idId.equals(other.pr_idId)) {
			return false;
		}
		if (this.fechalimite == null) {
			if (other.fechalimite != null) {
				return false;
			}
		} else if (!this.fechalimite.equals(other.fechalimite)) {
			return false;
		}

		if (this.usernameId == null) {
			if (other.usernameId != null) {
				return false;
			}
		} else if (!this.usernameId.equals(other.usernameId)) {
			return false;
		}
		if (this.fechafinalizacion == null) {
			if (other.fechafinalizacion != null) {
				return false;
			}
		} else if (!this.fechafinalizacion.equals(other.fechafinalizacion)) {
			return false;
		}
		return true;
	}

}
