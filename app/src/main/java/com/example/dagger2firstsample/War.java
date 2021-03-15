package com.example.dagger2firstsample;

import javax.inject.Inject;

public class War {


    private House1 house1;
    private House2 house2;

    @Inject
    public War(House1 house1, House2 house2){
        this.house1 = house1;
        this.house2 = house2;
    }

    public void prepare(){
        house1.prepareForWar();
        house2.prepareForWar();
    }

    public void report(){
        house1.reportForWar();
        house2.reportForWar();
    }
}

