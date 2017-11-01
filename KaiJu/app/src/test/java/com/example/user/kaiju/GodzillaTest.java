package com.example.user.kaiju;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 01/11/2017.
 */

public class GodzillaTest {

    Godzilla godzilla;

    @Before
    public void before(){
        godzilla = new Godzilla("Jase", 1000, 100);
    }

    @Test
    public void hasName(){
            assertEquals("Jase", godzilla.getName());
        }

    @Test
    public void checkHealthValue(){
            assertEquals(1000, godzilla.getHealthValue());
        }

    @Test
    public void checkAttackValue(){
            assertEquals(100, godzilla.getAttackValue());
        }

    @Test
    public void hasRoar(){
        assertEquals("YOSSS!", godzilla.roar());
    }


}
