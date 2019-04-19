package com.kinomo;

import com.kinomo.config.Client;
import com.kinomo.config.DefaultLocation;
import com.kinomo.config.Params;

import morphia.Morphia;
import test.CreateClient;
import test.GetClient;
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

            Client newCli = new Client("Kebab", "OOO Fitnes Shaurma", sPermission, sPhone, sEmail, defLoc);

            CreateClient cc = new CreateClient();
            cc.create(newCli);

        System.out.println("\n" + "--- --- ---" + "\n" + "Client's name is: " + newCli.getName());
        System.out.println("Client's legalname is: " + newCli.getLegalName());
        System.out.println("Client's email is: " + newCli.getEmail() + "\n" + "--- --- ---");

        GetClient gC = new GetClient();
        gC.getClient("5cb58b749c5c684dae21a67a");

    }
}