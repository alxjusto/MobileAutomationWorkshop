
package com.ui.mobile.helpers;

import org.openqa.selenium.By;

public class Login extends BaseAppium {

    By nombreDeUsuario = By.id("username");
    By claveDeUsuario = By.id("password");
    By botonLogIn = By.xpath("//android.view.ViewGroup[@content-desc='login']/android.widget.Button/android.widget.TextView");

    public void completarCredencialesDeUsuario() {
        driver.findElement(nombreDeUsuario).sendKeys("admin");
        driver.findElement(claveDeUsuario).sendKeys("admin");
        driver.findElement(botonLogIn).click();
    }

}
