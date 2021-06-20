package com.ui.mobile.helpers;

import com.ui.mobile.dataProviders.JsonDataProvider;
import com.ui.mobile.dtos.CapabilitiesDTO;
import com.ui.mobile.utilities.Utilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import okhttp3.internal.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseAppium {

    public static AppiumDriver<WebElement> driver;

    public void iniciarAppium() throws Exception {
        JsonDataProvider jsonDataProvider = new JsonDataProvider();
        CapabilitiesDTO capabilitiesDTO = jsonDataProvider.getCapability(Utilities.getProperty("device.name"));
        System.out.println(capabilitiesDTO.toString());

        DesiredCapabilities appiumConecction = new DesiredCapabilities();
        appiumConecction.setCapability("PlatformName", capabilitiesDTO.getPlatformName());
        appiumConecction.setCapability("platformVersion", capabilitiesDTO.getPlatformVersion());
        appiumConecction.setCapability("deviceName", capabilitiesDTO.getDeviceName());
        appiumConecction.setCapability("appPackage", capabilitiesDTO.getAppPackage());
        appiumConecction.setCapability("appActivity", capabilitiesDTO.getAppActivity());

        driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), appiumConecction);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void cerrarAppium() {
        if(driver != null){
            driver.closeApp();
            driver.quit();
        }
    }
}
