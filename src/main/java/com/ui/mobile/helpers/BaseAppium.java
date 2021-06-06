package com.ui.mobile.helpers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseAppium {

    public static AppiumDriver<WebElement> driver;

    public void iniciarAppium() throws Exception {
        System.out.println("appium connection....");

        DesiredCapabilities appiumConecction = new DesiredCapabilities();
        appiumConecction.setCapability("PlatformName", "Android");
        appiumConecction.setCapability("platformVersion", "8");
        appiumConecction.setCapability("deviceName", "ce08171872edcc24047e");
        appiumConecction.setCapability("appPackage", "com.vodqareactnative");
        appiumConecction.setCapability("appActivity", "com.vodqareactnative.MainActivity");

        driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), appiumConecction);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        Thread.sleep(5000);
    }

    public void cerrarAppium() {
        if(driver != null){
            driver.closeApp();
            driver.quit();
        }
    }
}
