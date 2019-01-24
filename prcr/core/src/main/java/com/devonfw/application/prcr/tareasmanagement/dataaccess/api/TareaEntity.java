package com.devonfw.application.prcr.tareasmanagement.dataaccess.api;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.devonfw.application.prcr.general.dataaccess.api.ApplicationPersistenceEntity;
import com.devonfw.application.prcr.proyectosmanagement.dataaccess.api.ProyectoEntity;
import com.devonfw.application.prcr.tareasmanagement.common.api.Tarea;
import com.devonfw.application.prcr.usermanagement.dataaccess.api.UserEntity;

@Entity
@Table(name = "Tareas")
public class TareaEntity extends ApplicationPersistenceEntity implements Tarea {

	private String nombre;

	private ProyectoEntity pr_id;

	private LocalDate fechalimite;

	private UserEntity username;

	private LocalDate fechafinalizacion;

	private static final long serialVersionUID = 1L;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinColumn(name = "pr_id")
	public ProyectoEntity getPr_id() {
		return pr_id;
	}

	public void setPr_id(ProyectoEntity pr_id) {
		this.pr_id = pr_id;
	}

	public LocalDate getFechalimite1() {
		return fechalimite;
	}

	public void setFechalimite(LocalDate fechalimite) {
		this.fechalimite = fechalimite;
	}

	@ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinColumn(name = "username")
	public UserEntity getUsername() {
		return username;
	}

	public void setUsername(UserEntity username) {
		this.username = username;
	}

	public LocalDate getFechafinalizacion1() {
		return fechafinalizacion;
	}

	public void setFechafinalizacion(LocalDate fechafinalizacion) {
		this.fechafinalizacion = fechafinalizacion;
	}

	@Override
	@Transient
	public Long getPr_idId() {

		if (this.pr_id == null) {
			return null;
		}
		return this.pr_id.getId();
	}

	@Override
	public void setPr_idId(Long pr_idId) {

		if (pr_idId == null) {
			this.pr_id = null;
		} else {
			ProyectoEntity proyectoEntity = new ProyectoEntity();
			proyectoEntity.setId(pr_idId);
			this.pr_id = proyectoEntity;
		}
	}

	@Override
	@Transient
	public Long getUsernameId() {

		if (this.username == null) {
			return null;
		}
		return this.username.getId();
	}

	@Override
	public void setUsernameId(Long usernameId) {

		if (usernameId == null) {
			this.username = null;
		} else {
			UserEntity userEntity = new UserEntity();
			userEntity.setId(usernameId);
			this.username = userEntity;
		}
	}

	@Override
	public LocalDate getFechalimite() {
		return fechalimite;
	}

	@Override
	public LocalDate getFechafinalizacion() {
		return fechafinalizacion;
	}

}
