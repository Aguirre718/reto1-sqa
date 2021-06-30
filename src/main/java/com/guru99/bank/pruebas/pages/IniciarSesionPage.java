package com.guru99.bank.pruebas.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.junit.Assert.assertTrue;

@DefaultUrl("http://demo.guru99.com/V1/index.php")
public class IniciarSesionPage {

    By txtUsuario = By.name("uid");
    By txtClave = By.name("password");
    By btnLogin = By.name("btnLogin");
    By lblText = By.xpath("//marquee[@class='heading3']");


    public void escribirUsuario(String usuario) {
        getDriver().findElement(txtUsuario).sendKeys(usuario);
    }

    public void escribirClave(String clave) {
        getDriver().findElement(txtClave).sendKeys(clave);
    }

    public void clickLogin() {
        getDriver().findElement(btnLogin).click();
    }

    public void validarTexto() {
        assertTrue(getDriver().findElement(lblText).isDisplayed());
    }

    public String obtenerTextoAlerta() {
        return getDriver().switchTo().alert().getText();
    }

}


