package org.mongodb;
import static com.mongodb.client.model.Filters.eq;
import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
public class MongoManager {


    private static MongoManager mongoManager;
    String connectionURI;
    String dbName;
    String collectionName;



    public MongoManager(){
        getMongoManager();
    }
    public MongoManager getMongoManager(){
        if(mongoManager == null){
            mongoManager = new MongoManager();
        }
        return mongoManager;
    }
    public static void setup(){

    }
    public Document getDocumentByFieldAndValue(String field, String value){
        try (MongoClient mongoClient = MongoClients.create(connectionURI)) {
            MongoDatabase database = mongoClient.getDatabase(dbName);
            MongoCollection<Document> collection = database.getCollection(collectionName);
            Document doc = collection.find(eq(field, value)).first();
            if (doc != null) {
                System.out.println(doc.toJson());
            } else {
                System.out.println("No matching documents found.");
            }
            return doc;
        }
    }
    public MongoManager(String connectionURI){
        this.connectionURI = connectionURI;
    }
    public MongoManager(String connectionURI, String dbName, String collectionName){
        this.collectionName = collectionName;
        this.dbName = dbName;
        this.connectionURI = connectionURI;
    }

    public String getConnectionURI() {
        return connectionURI;
    }

    public void setConnectionURI(String connectionURI) {
        this.connectionURI = connectionURI;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }


}
