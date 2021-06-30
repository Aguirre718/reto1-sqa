package com.guru99.bank.pruebas.steps;

import com.guru99.bank.pruebas.pages.RegistrarUsuarioPage;
import net.thucydides.core.annotations.Step;

public class RegistrarUsuarioStep {

    RegistrarUsuarioPage registroPOM = new RegistrarUsuarioPage();

    @Step
    public void abrirAplicacion() {
        registroPOM.open();
    }

    @Step
    public void generarUsuario() {
        registroPOM.generarUsuario();
    }

    @Step
    public void escribirCorreo(String correo) {
        registroPOM.escribirCorreo(correo);
    }

    @Step
    public void botonEnviar() {
        registroPOM.botonEnviar();
    }

    @Step
    public String obtenerTexto() {
        return registroPOM.obtenerTexto();
    }

}
