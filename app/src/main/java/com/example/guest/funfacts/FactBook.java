package com.example.guest.funfacts;

/**
 * Created by Guest on 11/30/15.
 */


import android.content.Context;

import java.util.Random;

public class FactBook {
    public Context mContext;
    public FactBook(Context mContext) {
        this.mContext = mContext;
    }

    //Member variables (properties about the object)
        public String[] mFacts = {
          mContext.getResources().getString(R.string.ants)
//                    R.string.ants,
//        Integer.toString(R.string.ostrich),
//                Integer.toString(R.string.olympic),
//                Integer.toString(R.string.bones),
//                Integer.toString(R.string.sun_light),
//                Integer.toString(R.string.bamboo),
//                Integer.toString(R.string.florida),
//                Integer.toString(R.string.penguins),
//                Integer.toString(R.string.habit),
//                Integer.toString(R.string.mammoths)
        };

    //Method (abilities the object can do)
    public String getFact() {
        String fact = "";

        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length); //random number between 1 and 3

        fact = mFacts[randomNumber];

        return fact;
    }
}
