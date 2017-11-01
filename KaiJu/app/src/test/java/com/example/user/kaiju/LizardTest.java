package com.example.user.kaiju;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 01/11/2017.
 */

public class LizardTest {

    Lizard lizard;

    @Before
    public void before(){
        lizard = new Lizard("John", 100, 10);
    }

    @Test
    public void hasName(){
        assertEquals("John", lizard.getName());
    }

    @Test
    public void checkHealthValue(){
        assertEquals(100, lizard.getHealthValue());
    }

    @Test
    public void checkAttackValue(){
        assertEquals(10, lizard.getAttackValue());
    }

    @Test
    public void hasRoar(){
        assertEquals("YASSS!", lizard.roar());
    }

}
