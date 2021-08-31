package com.ui.mobile.helpers;

import com.ui.mobile.dataProviders.JsonDataProvider;
import com.ui.mobile.dtos.CapabilitiesDTO;
import com.ui.mobile.utilities.Utilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseAppium {

    public static AppiumDriver<WebElement> driver;

    public void startAppium() throws Exception {
        JsonDataProvider jsonDataProvider = new JsonDataProvider();
        CapabilitiesDTO capabilitiesDTO = jsonDataProvider.getCapability(Utilities.getProperty("device.name"));
        System.out.println(capabilitiesDTO.toString());

        DesiredCapabilities appiumConnection = new DesiredCapabilities();
        appiumConnection.setCapability("PlatformName", capabilitiesDTO.getPlatformName());
        appiumConnection.setCapability("platformVersion", capabilitiesDTO.getPlatformVersion());
        appiumConnection.setCapability("deviceName", capabilitiesDTO.getDeviceName());
        appiumConnection.setCapability("appPackage", capabilitiesDTO.getAppPackage());
        appiumConnection.setCapability("appActivity", capabilitiesDTO.getAppActivity());

        driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), appiumConnection);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void closeAppium() {
        if (driver != null) {
            driver.closeApp();
            driver.quit();
        }
    }
}
