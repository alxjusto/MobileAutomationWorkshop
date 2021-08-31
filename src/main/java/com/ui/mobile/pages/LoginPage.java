
package com.ui.mobile.pages;

import com.ui.mobile.helpers.BaseAppium;
import com.ui.mobile.utilities.ControlUI;
import org.openqa.selenium.By;

public class LoginPage extends BaseAppium {

    By userName = By.xpath("//android.widget.EditText[@content-desc='username']");
    By userPassword = By.xpath("//android.widget.EditText[@content-desc='password']");
    By loginButton = By.xpath("//android.view.ViewGroup[@content-desc='login']/android.widget.Button/android.widget.TextView");

    ControlUI controlUI = new ControlUI();


    public void sendUserCredentials() {
        controlUI.waitForElement(userName);

        driver.findElement(userName).clear();
        driver.findElement(userPassword).clear();

        driver.findElement(userName).sendKeys("admin");
        driver.findElement(userPassword).sendKeys("admin");
        driver.findElement(loginButton).click();
    }

}
