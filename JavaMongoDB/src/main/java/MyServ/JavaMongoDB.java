package MyServ;



import java.util.Iterator;
import java.util.List;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;


public class JavaMongoDB {

	public static void main(String[] args) {
	
		
		 MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
		 System.out.println("Create MongoClient successfully");
		 
		 
		 MongoDatabase db = mongoClient.getDatabase("Lib");
		 System.out.println("Get database is successfully");
		 
		 System.out.println("Below are list of databases present in MongoDB");
		 MongoCursor<String> dbsCursor= mongoClient.listDatabaseNames().iterator();
		 while(dbsCursor.hasNext())
		 {
			 System.out.println(dbsCursor.next());
		 
		 }
		 MongoCollection<Document> collection= db.getCollection("Book");
		 Document doc = new Document().append("name","autor");
		 collection.insertOne(doc);
		 System.out.println("insert is done");	
		 
		  collection.deleteOne(Filters.eq("name", "autor"));
	      System.out.println("Document deleted successfully...");
	  
	      FindIterable<Document> iterDoc = collection.find();
	      int i = 1;
	      System.out.println("Remaining documents:");
	      Iterator<Document> it = iterDoc.iterator();
	      while (it.hasNext()) {
	    	 
	         System.out.println(it.next());
	         
	      }
	      FindIterable<Document> found = db.getCollection("Book").find(new Document("name","autor").append("name","autor"));

	 	 if (found.first() == null) {
	 	     collection.insertOne(new Document("name","autor").append("name","autor"));
	      
	      
		 mongoClient.dropDatabase("db1");
		 MongoCursor<String> dbsCursor2= mongoClient.listDatabaseNames().iterator();
		 while(dbsCursor2.hasNext())
		 {
			 System.out.println(dbsCursor2.next());
		 
		 }
		
	 }
	 	 
	 	 Book book = new Book(i, null, null);
	 	 book.addBook();
	 			 
	}
	
}


	
	
	