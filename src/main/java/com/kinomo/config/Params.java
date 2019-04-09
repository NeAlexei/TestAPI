package com.kinomo.config;
import java.util.ArrayList;

public class Params {
    public ArrayList<String> allowedPermission;
    public ArrayList<String> phone;
    public ArrayList<String> email;

    public ArrayList<String> setAllowedPermission() {
        allowedPermission.clear();
        allowedPermission.add("user:user:create:general");
        return allowedPermission;
    }

    public ArrayList<String> setPhone(){
        phone.clear();
        phone.add("0000-111-222");
        return phone;
    }

    public ArrayList<String> setEmail(){
        email.clear();
        email.add("SomethingEmail@gmail.com");
        return email;
    }
}
