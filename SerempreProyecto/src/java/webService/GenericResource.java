/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webService;

import core.AsignarTareas;
import core.Tareas;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author patri
 */
@Path("generic")
public class GenericResource {
    
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of core.GenericResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("/crearTarea/{titulo}/{descripcion}/{tiempo_estimado}/{tiempo_trabajo}/{nom_encargado}")
    public List<Tareas> getXml(@PathParam("titulo") String titulo,
            @PathParam("descripcion")  String descripcion, 
            @PathParam("tiempo_estimado")  int tiempo_estimado,
            @PathParam("tiempo_trabajo")  int tiempo_trabajo, 
            @PathParam("nom_encargado") String nom_encargado) {
        //TODO return proper representation object
        AsignarTareas a = new AsignarTareas();
        a.setearVarlores(titulo, descripcion, tiempo_estimado, tiempo_trabajo, nom_encargado);
        List<Tareas> crearTarea = a.crearTarea();
        crearTarea.forEach((tareas1) -> {
            System.out.println("Tarea" + tareas1);
        });
        return crearTarea;
    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
