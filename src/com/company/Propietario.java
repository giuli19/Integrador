package com.company;

public class Propietario {

    private String nombre;
    private Integer dni;
    private String dirección;


    public Propietario(String nombre, Integer dni, String dirección) {
        this.nombre = nombre;
        this.dni = dni;
        this.dirección = dirección;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }
}
