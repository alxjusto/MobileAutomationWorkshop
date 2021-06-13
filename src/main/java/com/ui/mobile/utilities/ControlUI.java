package com.ui.mobile.utilities;

import com.ui.mobile.helpers.BaseAppium;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ControlUI extends BaseAppium {

    public void esperarElemento(By elemento){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
    }
}
