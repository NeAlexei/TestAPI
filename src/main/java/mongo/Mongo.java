package mongo;

import com.mongodb.*;
import com.mongodb.client.MongoDatabase;

import com.mongodb.client.*;
import org.bson.Document;
import com.mongodb.ConnectionString;
import org.mongodb.morphia.Datastore;

import static com.kinomo.config.Settings.DB_HOST;
import static com.kinomo.config.Settings.DB_NAME;

public class Mongo {

    public void initMongo() {

//        Datastore database;
//        MongoClient mongoClient = new MongoClient(new MongoClientURI(DB_HOST));
//        Datastore datastore = mongoClient.getDB(DB_NAME);

        MongoClient mc = new MongoClient(new MongoClientURI(DB_HOST));
        DB db = mc.getDB(DB_NAME);

//      try{
//        MongoClient mongoClient = new MongoClient(new MongoClientURI(DB_HOST));
//        MongoDatabase database = mongoClient.getDatabase(DB_NAME);
//        System.out.println("Connected to DB");
//      } catch(Exception e)
//      {
//          System.out.println(e);
//      }
//    System.out.println("Server is ready");
    }
}

