package com.ui.mobile.pages;

import com.ui.mobile.helpers.BaseAppium;
import com.ui.mobile.utilities.ControlUI;
import org.openqa.selenium.By;

public class SamplesListPage extends BaseAppium {

    By backButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView");
    By longPressOption = By.xpath("//android.view.ViewGroup[@content-desc='longPress']/android.view.ViewGroup");
    By dragAndDropOption = By.xpath("//android.view.ViewGroup[@content-desc='dragAndDrop']/android.view.ViewGroup");
    By carrouselOption = By.xpath("//android.view.ViewGroup[@content-desc='carousel']/android.view.ViewGroup");

    ControlUI controlUI = new ControlUI();

    public void chooseCarrouselOptionFromSampleList() {
        controlUI.waitForElement(backButton);
        controlUI.moveFromOneElementToAnother(longPressOption, dragAndDropOption);
        controlUI.waitForElement(carrouselOption);
        driver.findElement(carrouselOption).click();
    }

}
