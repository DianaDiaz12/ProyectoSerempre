/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import core.Tareas;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.xml.ws.WebServiceRef;
import org.tempuri.Calculator;
import org.tempuri.CalculatorSoap;

/**
 *
 * @author patri
 */
@ManagedBean(name = "asignarTarea")
@ViewScoped
public class AsignarTareas implements Serializable {
    
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/www.dneonline.com/calculator.asmx.wsdl")
    private Calculator service = new Calculator();
    
    public Tareas objTarea;
    public List<Tareas> ListTareas;

    /**
     * Creates a new instance of AsignarTareas
     */
    public AsignarTareas() {
        this.objTarea = new Tareas();
        this.ListTareas = new ArrayList<>();
    }
    
    public void setearVarlores(String titulo, String descripcion, int tiempo_estimado, int tiempo_trabajo, String nom_encargado) {
        objTarea.setTitulo(titulo);
        objTarea.setDescripcion(descripcion);
        objTarea.setTiempo_estimado(tiempo_estimado);
        objTarea.setTiempo_trabajo(tiempo_trabajo);
        objTarea.setNom_encargado(nom_encargado);
        
    }
    
    public void crearTareas() {
        objTarea.setTiempo_restante(subtract(objTarea.getTiempo_estimado(), objTarea.getTiempo_trabajo()));
        ListTareas.add(objTarea);
        objTarea = new Tareas();
    }
    
    public List<Tareas> crearTarea() {
        objTarea.setTiempo_restante(subtract(objTarea.getTiempo_estimado(), objTarea.getTiempo_trabajo()));
        ListTareas.add(objTarea);
        objTarea = new Tareas();
        return ListTareas;
    }
    
    private int subtract(int intA, int intB) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        org.tempuri.CalculatorSoap port = service.getCalculatorSoap();
        return port.subtract(intA, intB);
    }
    
    public Tareas getObjTarea() {
        return objTarea;
    }
    
    public void setObjTarea(Tareas objTarea) {
        this.objTarea = objTarea;
    }
    
    public List<Tareas> getListTareas() {
        return ListTareas;
    }
    
    public void setListTareas(List<Tareas> ListTareas) {
        this.ListTareas = ListTareas;
    }
    
}
