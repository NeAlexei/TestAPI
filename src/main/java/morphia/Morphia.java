package morphia;
import com.kinomo.config.Client;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.mongodb.morphia.Datastore;
import static com.kinomo.config.Settings.DB_HOST;
import static com.kinomo.config.Settings.DB_NAME;

public class Morphia {

    public void initMorphia() {

        org.mongodb.morphia.Morphia morphia = new org.mongodb.morphia.Morphia();
        Datastore datastore = morphia.createDatastore(new MongoClient(new MongoClientURI(DB_HOST)), DB_NAME);

        morphia.mapPackage("main.java.morphia");

        System.out.println("- - -" + "\n" + datastore.getCount(Client.class));

        datastore.getCollection(Client.class);

        Client client = datastore.find(Client.class).field("_id").equal("5cb58b749c5c684dae21a67a").get();

    }
}
