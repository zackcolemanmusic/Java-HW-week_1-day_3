package com.example.user.kaiju;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 01/11/2017.
 */

public class ViperTest {

    Viper viper;

    @Before
    public void before(){
        viper = new Viper("V3", 200);
    }

    @Test
    public void getType(){
        assertEquals("V3", viper.getType());

    }

    @Test
    public void getHealthValue(){
        assertEquals(200, viper.getHealthValue());
    }
}
