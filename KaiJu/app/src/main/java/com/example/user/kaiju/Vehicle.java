package com.example.user.kaiju;

/**
 * Created by user on 01/11/2017.
 */

public abstract class Vehicle {

    String type;
    int healthValue;

    public Vehicle(String type, int healthValue) {
        this.type = type;
        this.healthValue = healthValue;
    }

    public String getType(){
        return this.type;
    }

    public int getHealthValue(){
        return this.healthValue;
    }
}
