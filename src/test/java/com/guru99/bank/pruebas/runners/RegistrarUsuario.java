package com.guru99.bank.pruebas.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)    //Cambia a cucumber with serenity
@CucumberOptions(
        features = {"src/test/resources/com.guru99.bank.pruebas.features/registrar_usuario.feature"},
        glue = {"com.guru99.bank.pruebas.stepdefinitions"},
        snippets = SnippetType.CAMELCASE)

public class RegistrarUsuario {
}
