package com.ui.mobile.dtos;

public class CapabilitiesDTO {
    String PlatformName;
    String platformVersion;
    String deviceName;
    String appPackage;
    String appActivity;

    public String getPlatformName() {
        return PlatformName;
    }

    public String getPlatformVersion() {
        return platformVersion;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String getAppPackage() {
        return appPackage;
    }

    public String getAppActivity() {
        return appActivity;
    }
}
