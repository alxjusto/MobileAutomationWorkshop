package com.ui.mobile.tests;

import com.ui.mobile.helpers.BaseAppium;
import com.ui.mobile.helpers.Login;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class Tests {

    static BaseAppium baseAppium = new BaseAppium();
    Login login = new Login();

    @BeforeAll
    public static void setUp() throws Exception {
        baseAppium.iniciarAppium();
    }

    @Test
  @DisplayName("Test that performs the login")
    public void LoginTest() throws Exception {
        login.ingresarCredencialesDeUsuario();
    }

    @AfterAll
    public static void cerrarConexiones() {
        baseAppium.cerrarAppium();
    }


}
