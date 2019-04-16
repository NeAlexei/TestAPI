package com.kinomo.config;
import java.util.ArrayList;

public class Params {
    public ArrayList<String> allowedPermission = new ArrayList<>();
    public ArrayList<String> phone = new ArrayList<>();
    public ArrayList<String> email = new ArrayList<>();

    public ArrayList<String> sAllowedPermission() {
        allowedPermission.clear();
        allowedPermission.add("user:user:create:general");
        return allowedPermission;
    }

    public ArrayList<String> sPhone(){
        phone.clear();
        phone.add("+00000-000-00-00");
        return phone;
    }

    public ArrayList<String> sEmail(){
        email.clear();
        email.add("00@gmail.com");
        return email;
    }
}
