package com.devonfw.application.prcr.proyectosmanagement.service.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.data.domain.Page;

import com.devonfw.application.prcr.proyectosmanagement.logic.api.Proyectosmanagement;
import com.devonfw.application.prcr.proyectosmanagement.logic.api.to.ProyectoEto;
import com.devonfw.application.prcr.proyectosmanagement.logic.api.to.ProyectoSearchCriteriaTo;

/**
 * The service interface for REST calls in order to execute the logic of
 * component {@link Proyectosmanagement}.
 */
@Path("/proyectosmanagement/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface ProyectosmanagementRestService {

	/**
	 * Delegates to {@link Proyectosmanagement#findProyecto}.
	 *
	 * @param id the ID of the {@link ProyectoEto}
	 * @return the {@link ProyectoEto}
	 */
	@GET
	@Path("/proyecto/{id}/")
	public ProyectoEto getProyecto(@PathParam("id") long id);

	/**
	 * Delegates to {@link Proyectosmanagement#saveProyecto}.
	 *
	 * @param proyecto the {@link ProyectoEto} to be saved
	 * @return the recently created {@link ProyectoEto}
	 */
	@POST
	@Path("/proyecto/")
	public ProyectoEto saveProyecto(ProyectoEto proyecto);

	/**
	 * Delegates to {@link Proyectosmanagement#deleteProyecto}.
	 *
	 * @param id ID of the {@link ProyectoEto} to be deleted
	 */
	@DELETE
	@Path("/proyecto/{id}/")
	public void deleteProyecto(@PathParam("id") long id);

	/**
	 * Delegates to {@link Proyectosmanagement#findProyectoEtos}.
	 *
	 * @param searchCriteriaTo the pagination and search criteria to be used for
	 *                         finding proyectos.
	 * @return the {@link Page list} of matching {@link ProyectoEto}s.
	 */
	@Path("/proyecto/search")
	@POST
	public Page<ProyectoEto> findProyectos(ProyectoSearchCriteriaTo searchCriteriaTo);

}