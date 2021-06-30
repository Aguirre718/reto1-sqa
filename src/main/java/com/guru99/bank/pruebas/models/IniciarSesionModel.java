package com.guru99.bank.pruebas.models;

public class IniciarSesionModel {

    String usuario;
    String clave;

    public IniciarSesionModel(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }
}
