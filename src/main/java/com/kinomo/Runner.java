package com.kinomo;

import com.kinomo.config.Client;
import com.kinomo.config.DefaultLocation;
import com.kinomo.config.Params;

import morphia.Mor;
import test.GetToken;
import java.util.ArrayList;
import static com.kinomo.config.Settings.*;

public class Runner {

    public static void main(String[] args) {

        GetToken getToken = new GetToken();
        SESSION_TOKEN = getToken.token();
        System.out.println("Session token is: " + SESSION_TOKEN);

            Params par = new Params();
            ArrayList<String> sPermission = par.sAllowedPermission();
            ArrayList<String> sPhone = par.sPhone();
            ArrayList<String> sEmail = par.sEmail();

            DefaultLocation defLoc = new DefaultLocation(51.456882, -0.196399, "Point");

            Client newCli = new Client("Q", "ZAO Paradise", sPermission, sPhone, sEmail, defLoc);
//            CreateClient cc = new CreateClient();
//            cc.create(newCli);

//        System.out.println("\n" + "--- --- ---" + "\n" + "Client's name is: " + newCli.getName());
//        System.out.println("Client's legalname is: " + newCli.getLegalName());
//        System.out.println("Client's email is: " + newCli.getEmail() + "\n" + "--- --- ---");

//        System.out.println("Get client by id");

//        GetClient gC = new GetClient();
//        gC.getClient("58a0a723787b9a192aa39f1f");

        Mor m = new Mor();
        m.initMorphia();
    }
}