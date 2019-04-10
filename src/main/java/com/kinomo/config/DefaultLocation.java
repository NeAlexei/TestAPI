package com.kinomo.config;

import java.util.ArrayList;
import java.util.List;

import static jdk.nashorn.internal.runtime.regexp.joni.Syntax.Java;

public class DefaultLocation {
    public List<Double> aList;
    public String type;

    public DefaultLocation() { //
    }

    public List<Double> getaList() {
        return aList;
    }

    public void setaList(Double lt, Double lng) {
        aList = new ArrayList<>();
        aList.add(lt);
        aList.add(lng);
    }

    public DefaultLocation(Double lt, Double lng, String type) {
        setaList(lt, lng);
        this.type = type;
    }
//
//    public List<Double> setCoordinates() {
//        aList.add(51.456882);
//        aList.add(-0.196399);
//        return aList;
//    }
//
//    public String setType() {
//        type = "Point";
//        return type;
//    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}


