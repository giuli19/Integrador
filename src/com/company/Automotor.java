package com.company;

public class Automotor {

    private Propietario propietario;
    protected Boolean particular = true;
    protected Boolean profesional = true;

    public Automotor(){
    }

    public Automotor(Boolean particular, Boolean profesional) {
        this.particular = true;
        this.profesional = true;
    }
}
