package com.guru99.bank.pruebas.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://demo.guru99.com/V1/index.php")
public class RegistrarUsuarioPage extends PageObject {

    By btnGenerarAcceso = By.xpath("//a[contains(text(), 'here')]");
    By txtCorreo = By.name("emailid");
    By btnEnviar = By.name("btnLogin");

    public void generarUsuario() {
        getDriver().findElement(btnGenerarAcceso).click();
    }

    public void escribirCorreo(String correo) {
        getDriver().findElement(txtCorreo).sendKeys(correo);
    }

    public void botonEnviar() {
        getDriver().findElement(btnEnviar).click();
    }

    public String obtenerTexto() {
        return getTitle();
    }
}
