package com.example.guest.funfacts;

/**
 * Created by Guest on 11/30/15.
 */


import android.content.Context;

import java.util.Random;

public class FactBook {


    //Member variables (properties about the object)
        public String[] mFacts = {};
        public String[] mColors = {};


    //Method (abilities the object can do)
    public String getFact() {
        String fact = "";

        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length); //random number between 1 and the length of mFacts

        fact = mFacts[randomNumber];

        return fact;
    }

    public String getColor() {
        String color = "";

        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length); //random number between 1 and the length of mColors

        color = mColors[randomNumber];

        return color;
    }
}
