
package com.ui.mobile.pages;

import com.ui.mobile.enums.Locator;
import com.ui.mobile.helpers.BaseAppium;
import com.ui.mobile.utilities.ControlUI;

public class LoginPage extends BaseAppium {

    ControlUI controlUI = new ControlUI();

    public void sendUserCredentials() {
        controlUI.waitForElement(Locator.USER_NAME.getLocator());

        Locator.USER_NAME.clear(driver);
        Locator.USER_PASSWORD.clear(driver);

        Locator.USER_NAME.sendKeys(driver,"admin");
        Locator.USER_PASSWORD.sendKeys(driver,"admin");
        Locator.LOGIN_BUTTON.selectUsing(driver);
    }
}
