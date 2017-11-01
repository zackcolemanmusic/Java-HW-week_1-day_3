package com.example.user.kaiju;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 01/11/2017.
 */

public class DodgeTest {

    Dodge dodge;

    @Before
    public void before(){
        dodge = new Dodge("V2", 100);
    }

    @Test
    public void getType(){
        assertEquals("V2", dodge.getType());
    }

    @Test
    public void getHealthValue(){
        assertEquals(100, dodge.getHealthValue());
    }




}
