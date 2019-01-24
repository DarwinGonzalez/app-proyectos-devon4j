package com.devonfw.application.prcr.proyectosmanagement.logic.api.to;

import com.devonfw.application.prcr.proyectosmanagement.common.api.Proyecto;
import com.devonfw.module.basic.common.api.to.AbstractEto;

/**
 * Entity transport object of Proyecto
 */
public class ProyectoEto extends AbstractEto implements Proyecto {

	private static final long serialVersionUID = 1L;

	private String nombre;

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((this.nombre == null) ? 0 : this.nombre.hashCode());
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
		ProyectoEto other = (ProyectoEto) obj;
		if (this.nombre == null) {
			if (other.nombre != null) {
				return false;
			}
		} else if (!this.nombre.equals(other.nombre)) {
			return false;
		}
		return true;
	}
}
