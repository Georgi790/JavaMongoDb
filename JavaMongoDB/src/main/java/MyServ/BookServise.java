package MyServ;

import java.util.List;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class BookServise {
	class BookService {
		
		private final MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
		private final MongoDatabase mongoDatabase = mongoClient.getDatabase("Lib");
		
		List<Book> getAllBooks() {
			
			
			return null;
		}
		
		Book getBookById(int id) {
			return null;
		}
		
		void deleteBookById(int id) {
		
			
		}
		
		void addBook(Book book) {
			book.addBook();
		}
	}
}
