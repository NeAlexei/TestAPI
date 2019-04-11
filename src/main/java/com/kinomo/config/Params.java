package com.kinomo.config;
import java.util.ArrayList;

public class Params {
    public ArrayList<String> allowedPermission;
    public ArrayList<String> phone;
    public ArrayList<String> email;

    public ArrayList<String> sAllowedPermission() {
//        allowedPermission.clear();
        allowedPermission.add("user:user:create:general");
        return allowedPermission;
    }

    public ArrayList<String> sPhone(){
//        phone.clear();
        phone.add("0000-111-222");
        return phone;
    }

    public ArrayList<String> sEmail(){
//        email.clear();
        email.add("SomethingEmail@gmail.com");
        return email;
    }
}
