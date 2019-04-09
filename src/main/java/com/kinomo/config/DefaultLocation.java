package com.kinomo.config;

import java.util.ArrayList;
import static jdk.nashorn.internal.runtime.regexp.joni.Syntax.Java;

public class DefaultLocation {
    public ArrayList<Double> aList;
    public String type;

    public DefaultLocation() { //
    }

    public DefaultLocation(ArrayList<Double> aList, String type) {
        this.aList = aList;
        this.type = type;
    }

    public ArrayList<Double> setCoordinates() {
        aList.add(51.456882);
        aList.add(-0.196399);
        return aList;
    }

    public String setType() {
        type = "Point";
        return type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}


