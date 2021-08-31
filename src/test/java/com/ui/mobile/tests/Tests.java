package com.ui.mobile.tests;

import com.ui.mobile.helpers.BaseAppium;
import com.ui.mobile.pages.LoginPage;
import com.ui.mobile.pages.SamplesListPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class Tests {

    static BaseAppium baseAppium = new BaseAppium();
    LoginPage loginPage = new LoginPage();
    SamplesListPage samplesListPage = new SamplesListPage();

    @BeforeAll
    public static void setUp() throws Exception {
        baseAppium.startAppium();
    }

    @Test
    @DisplayName("Test that performs the login")
    public void LoginTest() {
        loginPage.sendUserCredentials();
        samplesListPage.chooseCarrouselOptionFromSampleList();
    }

    @AfterAll
    public static void closeConnection() {
        baseAppium.closeAppium();
    }

}
