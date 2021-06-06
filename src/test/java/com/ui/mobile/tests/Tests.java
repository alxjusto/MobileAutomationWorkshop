package com.ui.mobile.tests;

import com.ui.mobile.helpers.BaseAppium;
import com.ui.mobile.helpers.Login;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class Tests {

    static BaseAppium baseAppium = new BaseAppium();
    Login login = new Login();

    @BeforeAll
    public static void setUp() throws Exception {
        baseAppium.iniciarAppium();
    }

    @Test
    public void LoginTest() throws Exception {
        login.completarCredencialesDeUsuario();
    }

    @AfterAll
    public static void cerrarTodo() {
        baseAppium.cerrarAppium();
    }


}
