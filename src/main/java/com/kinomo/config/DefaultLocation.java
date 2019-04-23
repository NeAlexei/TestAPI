package com.kinomo.config;

import org.mongodb.morphia.annotations.Id;

import java.util.ArrayList;
import java.util.List;


public class DefaultLocation {

    public List<Double> aList;
    public String type;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}


