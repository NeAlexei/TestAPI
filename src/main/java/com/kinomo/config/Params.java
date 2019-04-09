package com.kinomo.config;

import java.util.ArrayList;

public class Params {

    public ArrayList<Double> aList;
    public String type;

    public ArrayList<Double> setCoordinates() {
        aList.add(51.456882);
        aList.add(-0.196399);
        return aList;
    }

    public Params(ArrayList < Double > aList, String type) {
        this.aList = aList;
        this.type = type;
    }

    public Params(){
    }

}
