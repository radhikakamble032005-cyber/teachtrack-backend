import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class MongoDBConnection {

    private static final String CONNECTION_STRING =
            "mongodb://localhost:27017";

    private static final MongoClient mongoClient =
            MongoClients.create(CONNECTION_STRING);

    public static MongoDatabase getDatabase() {
        return mongoClient.getDatabase("TeachTrack");
    }

    public static void main(String[] args) {
        MongoDatabase database = getDatabase();

        System.out.println("Connected to MongoDB!");
        System.out.println("Database: " + database.getName());
    }
}