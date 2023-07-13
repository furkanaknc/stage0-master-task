package com.epam.OOP;

public class Bird extends com.epam.OOP.Animal {
    public Bird(){
        super("blue",2,false);
    }

    public String getDescription(){
        String wingsStatus = "it has 2 wings and can fly.";
        return super.getDescription() + " Moreover, " + wingsStatus;
    }
}
