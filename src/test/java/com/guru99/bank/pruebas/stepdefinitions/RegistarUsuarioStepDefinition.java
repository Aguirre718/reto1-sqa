package com.guru99.bank.pruebas.stepdefinitions;

import com.guru99.bank.pruebas.steps.RegistrarUsuarioStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import org.hamcrest.Matchers;

import java.util.List;

import static org.junit.Assert.assertThat;

public class RegistarUsuarioStepDefinition {

    @Steps
    RegistrarUsuarioStep registrarSteps;

    @Dado("^que estoy en la página de inicio de Gtpl Bank$")
    public void queEstoyEnLaPáginaDeInicioDeGtplBank() {
        registrarSteps.abrirAplicacion();
    }

    @Cuando("^genero mi acceso con correo$")
    public void generoMiAccesoConCorreo(List<String> datatable) {
        registrarSteps.generarUsuario();
        registrarSteps.escribirCorreo(datatable.get(0));
        registrarSteps.botonEnviar();
    }

    @Entonces("^valido la creación del usuario$")
    public void validoLaCreaciónDelUsuario() {
        assertThat(registrarSteps.obtenerTexto(), Matchers.is("Guru99 Bank Home Page"));
    }
}
