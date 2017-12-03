package com.example.sherryperez.micontactos;

/**
 * Created by waltersanti on 1/12/2017.
 */

public class contacto {
    private String nombre;
    private String telefono;
    private String email;
    private int position;

    public contacto(String nombre, String telefono ,String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email= email;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
