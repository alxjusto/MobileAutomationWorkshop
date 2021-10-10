package com.ui.mobile.pages;

import com.ui.mobile.enums.Locator;
import com.ui.mobile.helpers.BaseAppium;
import com.ui.mobile.utilities.ControlUI;

public class SamplesListPage extends BaseAppium {

    ControlUI controlUI = new ControlUI();

    public void chooseCarrouselOptionFromSampleList() {
        controlUI.waitForElement(Locator.BACK_BUTTON.getLocator());
        controlUI.moveFromOneElementToAnother(Locator.LONG_PRESS_OPTION.getLocator(), Locator.DRAG_AND_DROP_OPTION.getLocator());
        controlUI.waitForElement(Locator.CARROUSEL_OPTION.getLocator());
        Locator.CARROUSEL_OPTION.selectUsing(driver);
    }
}
