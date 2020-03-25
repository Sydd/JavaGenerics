package com.company;

import java.util.LinkedList;

public class Persona implements Comparable<Persona> {
    private String nombre;
    private String apellido;
    private int edad;
    int dni;

    public Persona(String pnombre, String papellido, int pedad, int pdni){
            nombre = pnombre;
            apellido = papellido;
            edad = pedad;
            dni = pdni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int compareTo(Persona o) {
        return this.getEdad() - o.getEdad();

    }
}
