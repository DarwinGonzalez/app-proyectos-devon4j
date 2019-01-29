package com.devonfw.application.prcr.tareasmanagement.service.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.data.domain.Page;

import com.devonfw.application.prcr.tareasmanagement.logic.api.Tareasmanagement;
import com.devonfw.application.prcr.tareasmanagement.logic.api.to.TareaCto;
import com.devonfw.application.prcr.tareasmanagement.logic.api.to.TareaEto;
import com.devonfw.application.prcr.tareasmanagement.logic.api.to.TareaSearchCriteriaTo;

/**
 * The service interface for REST calls in order to execute the logic of
 * component {@link Tareasmanagement}.
 */
@Path("/tareasmanagement/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface TareasmanagementRestService {

	/**
	 * Delegates to {@link Tareasmanagement#findTareaEto}.
	 *
	 * @param id the ID of the {@link TareaEto}
	 * @return the {@link TareaEto}
	 */
	@GET
	@Path("/tarea/eto/{id}/")
	public TareaEto getTareaEto(@PathParam("id") long id);

	/**
	 * Delegates to {@link Tareasmanagement#findTareaCto}.
	 *
	 * @param id the ID of the {@link TareaCto}
	 * @return the {@link TareaCto}
	 */
	@GET
	@Path("/tarea/cto/{id}/")
	public TareaCto getTareaCto(@PathParam("id") long id);

	/**
	 * Delegates to {@link Tareasmanagement#findTareaCtos}.
	 *
	 * @param searchCriteriaTo the pagination and search criteria to be used for
	 *                         finding tareas.
	 * @return the {@link Page list} of matching {@link TareaCto}s.
	 */
	@Path("/tarea/cto/search")
	@POST
	public Page<TareaCto> findTareaCtos(TareaSearchCriteriaTo searchCriteriaTo);

}