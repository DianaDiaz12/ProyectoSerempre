/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

/**
 *
 * @author patri
 */
public class Tareas {

    private String titulo;
    private String descripcion;
    private int tiempo_estimado;
    private int tiempo_trabajo;
    private String nom_encargado;
    public int tiempo_restante;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTiempo_estimado() {
        return tiempo_estimado;
    }

    public void setTiempo_estimado(int tiempo_estimado) {
        this.tiempo_estimado = tiempo_estimado;
    }

    public int getTiempo_trabajo() {
        return tiempo_trabajo;
    }

    public void setTiempo_trabajo(int tiempo_trabajo) {
        this.tiempo_trabajo = tiempo_trabajo;
    }

    public String getNom_encargado() {
        return nom_encargado;
    }

    public void setNom_encargado(String nom_encargado) {
        this.nom_encargado = nom_encargado;
    }

    public int getTiempo_restante() {
        return tiempo_restante;
    }

    public void setTiempo_restante(int tiempo_restante) {
        this.tiempo_restante = tiempo_restante;
    }
    
    
    
}
