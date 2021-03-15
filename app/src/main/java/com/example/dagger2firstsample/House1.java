package com.example.dagger2firstsample;

import android.util.Log;

import javax.inject.Inject;

public class House1 implements House {

    @Inject
    public House1() {
    }

    @Override
    public void prepareForWar() {
        Log.d("myLog",this.getClass().getSimpleName() + "prepareForWar");
    }

    @Override
    public void reportForWar() {
        Log.d("myLog",this.getClass().getSimpleName() + "prepareFoWar");
    }
}
