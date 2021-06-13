package com.ui.mobile.utilities;

import com.ui.mobile.helpers.BaseAppium;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ControlUI extends BaseAppium {

    public void esperarElemento(By elemento){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
    }

    public void moverseDesdeElementoUnoHaciaElmentoDos(By elementoUno, By elementoDos) {
        int x1, y1, x2, y2;
        x1 = driver.findElement(elementoUno).getLocation().getX();
        y1 = driver.findElement(elementoUno).getLocation().getY();
        x2 = driver.findElement(elementoDos).getLocation().getX();
        y2 = driver.findElement(elementoDos).getLocation().getY();
        swipe(x1, y1, x2, y2);
    }

    private void swipe(int x1, int y1, int x2, int y2) {
        TouchAction actions = new TouchAction(driver);
        actions.press(PointOption.point(x1, y1)).waitAction().moveTo(PointOption.point(x2, y2)).release().perform();
    }
}
