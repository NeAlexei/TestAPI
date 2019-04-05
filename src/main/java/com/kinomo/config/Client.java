//package com.kinomo.config;
//import org.json.JSONObject;
import com.kinomo.config.DefaultLocation;

import java.util.ArrayList;

import static com.jayway.restassured.RestAssured.put;

public class Client {

    private String _id;
    private String name;
    private String legalName;

    private ArrayList<String> allowedPermissions;
    private ArrayList<String> phone;
    private ArrayList<String> email;
    private DefaultLocation defaultLocation;

    public Client(String _id, String name, String legalName, ArrayList<String> allowedPermissions, ArrayList<String> phone, ArrayList<String> email, DefaultLocation defaultLocation) {
        this._id = _id;
        this.name = name;
        this.legalName = legalName;
        this.allowedPermissions = allowedPermissions;
        this.phone = phone;
        this.email = email;
        this.defaultLocation = defaultLocation;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public ArrayList<String> getAllowedPermissions() {
        return allowedPermissions;
    }

    public void setAllowedPermissions(ArrayList<String> allowedPermissions) {
        this.allowedPermissions = allowedPermissions;
    }

    public ArrayList<String> getPhone() {
        return phone;
    }

    public void setPhone(ArrayList<String> phone) {
        this.phone = phone;
    }

    public ArrayList<String> getEmail() {
        return email;
    }

    public void setEmail(ArrayList<String> email) {
        this.email = email;
    }

    public DefaultLocation getDefaultLocation() {
        return defaultLocation;
    }

    public void setDefaultLocation(DefaultLocation defaultLocation) {
        this.defaultLocation = defaultLocation;
    }
}


