package com.guru99.bank.pruebas.stepdefinitions;

import com.guru99.bank.pruebas.models.IniciarSesionModel;
import com.guru99.bank.pruebas.steps.IniciarSesionStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import org.hamcrest.Matchers;

import java.util.List;

import static org.junit.Assert.assertThat;

public class IniciarSesionStepDefinition {

    @Steps
    IniciarSesionStep inicioSteps;

    @Cuando("^ingreso mi usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
    public void ingreso_mi_usuario_y_clave(String usuario, String clave) {
        inicioSteps.escribirUsuario(usuario);
        inicioSteps.escribirClave(clave);
        inicioSteps.clickLogin();
    }

    @Cuando("^ingreso mis credenciales$")
    public void ingresoMisCredenciales(List<IniciarSesionModel> listaUsuarios) {
        inicioSteps.escribirUsuario(listaUsuarios.get(0).getUsuario());
        inicioSteps.escribirClave(listaUsuarios.get(0).getClave());
        inicioSteps.clickLogin();
    }

    @Entonces("^valido el inicio de sesión$")
    public void valido_el_inicio_de_sesión() {
        inicioSteps.validarTexto();
    }

    @Entonces("^valido la alerta$")
    public void valido_la_alerta() {
        assertThat(inicioSteps.obtenerTextoAlerta(), Matchers.is("User is not valid"));
    }
}
