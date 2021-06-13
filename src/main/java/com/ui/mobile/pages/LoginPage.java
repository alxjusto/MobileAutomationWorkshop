
package com.ui.mobile.pages;

import com.ui.mobile.helpers.BaseAppium;
import com.ui.mobile.utilities.ControlUI;
import org.openqa.selenium.By;

public class LoginPage extends BaseAppium {

    By nombreDeUsuario = By.xpath("//android.widget.EditText[@content-desc='username']");
    By claveDeUsuario = By.xpath("//android.widget.EditText[@content-desc='password']");
    By botonLogIn = By.xpath("//android.view.ViewGroup[@content-desc='login']/android.widget.Button/android.widget.TextView");

    ControlUI controlUI = new ControlUI();

    public void ingresarCredencialesDeUsuario() throws InterruptedException {
        controlUI.esperarElemento(nombreDeUsuario);

        driver.findElement(nombreDeUsuario).clear();
        driver.findElement(claveDeUsuario).clear();

        driver.findElement(nombreDeUsuario).sendKeys("admin");
        driver.findElement(claveDeUsuario).sendKeys("admin");
        driver.findElement(botonLogIn).click();
    }

}
