package com.ui.mobile.utilities;

import com.ui.mobile.helpers.BaseAppium;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ControlUI extends BaseAppium {

    public void waitForElement(By element) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void moveFromOneElementToAnother(By firstElement, By secondElement) {
        int x1, y1, x2, y2;
        x1 = driver.findElement(firstElement).getLocation().getX();
        y1 = driver.findElement(firstElement).getLocation().getY();
        x2 = driver.findElement(secondElement).getLocation().getX();
        y2 = driver.findElement(secondElement).getLocation().getY();
        swipe(x1, y1, x2, y2);
    }

    private void swipe(int x1, int y1, int x2, int y2) {
        TouchAction actions = new TouchAction(driver);
        actions.press(PointOption.point(x1, y1)).waitAction().moveTo(PointOption.point(x2, y2)).release().perform();
    }
}
