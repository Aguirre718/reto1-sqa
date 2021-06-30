package com.guru99.bank.pruebas.steps;

import com.guru99.bank.pruebas.pages.IniciarSesionPage;
import net.thucydides.core.annotations.Step;

public class IniciarSesionStep {

    IniciarSesionPage iniciarPOM = new IniciarSesionPage();

    @Step
    public void escribirUsuario (String usuario) {
        iniciarPOM.escribirUsuario(usuario);
    }

    @Step
    public void escribirClave (String clave) {
        iniciarPOM.escribirClave(clave);
    }

    @Step
    public void clickLogin() {
        iniciarPOM.clickLogin();
    }

    @Step
    public void validarTexto() {
        iniciarPOM.validarTexto();
    }

    @Step
    public String obtenerTextoAlerta () {
        return  iniciarPOM.obtenerTextoAlerta();
    }
}
