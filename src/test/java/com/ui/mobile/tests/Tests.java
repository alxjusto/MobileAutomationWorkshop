package com.ui.mobile.tests;

import com.ui.mobile.run.BaseAppium;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class Tests {

    static BaseAppium baseAppium = new BaseAppium();

    @BeforeAll
    public static void setUp() throws Exception {
        baseAppium.iniciarAppium();
    }

    @Test
    public void prueba1() throws Exception {
        System.out.println("inicio?");
    }

    @AfterAll
    public static void cerrarTodo() {
        baseAppium.cerrarAppium();
    }


}
