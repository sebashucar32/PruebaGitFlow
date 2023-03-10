package com.sofka.curso.gitflow;

public class Persona {
    private Integer id;
    private String nombre;
    private Double sueldo;

    public Persona(Integer id, String nombre, Double sueldo) {
        this.id = id;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return nombre + " con Id: " + id + " Tiene un sueldo de " + sueldo;
    }
}
