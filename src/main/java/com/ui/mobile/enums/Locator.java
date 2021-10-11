package com.ui.mobile.enums;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public enum Locator {

    BACK_BUTTON(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")),
    LONG_PRESS_OPTION(By.xpath("//android.view.ViewGroup[@content-desc='longPress']/android.view.ViewGroup")),
    DRAG_AND_DROP_OPTION(By.xpath("//android.view.ViewGroup[@content-desc='dragAndDrop']/android.view.ViewGroup")),
    CARROUSEL_OPTION(By.xpath("//android.view.ViewGroup[@content-desc='carousel']/android.view.ViewGroup")),

    USER_NAME(By.xpath("//android.widget.EditText[@content-desc='username']")),
    USER_PASSWORD(By.xpath("//android.widget.EditText[@content-desc='password']")),
    LOGIN_BUTTON(By.xpath("//android.view.ViewGroup[@content-desc='login']/android.widget.Button/android.widget.TextView"));

    private final By locator;

    Locator(By locator) {
        this.locator = locator;
    }

    public By getLocator() {
        return locator;
    }

    public void selectUsing(AppiumDriver<WebElement> driver) {
        driver.findElement(locator).click();
    }

    public void clear(AppiumDriver<WebElement> driver) {
        driver.findElement(locator).clear();
    }

    public void sendKeys(AppiumDriver<WebElement> driver, String text) {
        driver.findElement(locator).sendKeys(text);
    }
}
