package mongo;

import com.mongodb.*;
import com.mongodb.client.MongoDatabase;

import static com.kinomo.config.Settings.DB_HOST;
import static com.kinomo.config.Settings.DB_NAME;

public class Mongo {

    public static void connectToDb(){

//    try{
        MongoClient mongoClient = new MongoClient(DB_HOST);
        MongoDatabase db = mongoClient.getDatabase(DB_NAME);
        System.out.println("Connected to DB");
//    } catch(Exception e)
//    {
//        System.out.println(e);
//    }

    System.out.println("Server is ready");

    }
}
