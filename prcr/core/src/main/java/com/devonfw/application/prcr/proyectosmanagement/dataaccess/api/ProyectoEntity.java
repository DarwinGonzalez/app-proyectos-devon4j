package com.devonfw.application.prcr.proyectosmanagement.dataaccess.api;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.devonfw.application.prcr.general.dataaccess.api.ApplicationPersistenceEntity;
import com.devonfw.application.prcr.proyectosmanagement.common.api.Proyecto;

@Entity
@Table(name = "Proyectos")
public class ProyectoEntity extends ApplicationPersistenceEntity implements Proyecto {

	private String nombre;

	private static final long serialVersionUID = 1L;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
