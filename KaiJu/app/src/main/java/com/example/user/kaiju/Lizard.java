package com.example.user.kaiju;

/**
 * Created by user on 01/11/2017.
 */

public class Lizard extends Kaiju{

    public Lizard(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String roar(){
        return "YASSS!";
    }

}
