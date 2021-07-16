package MyServ;

import java.util.*;
import javax.swing.JOptionPane;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class Book {
	
	private final MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
	private final MongoDatabase mongoDatabase = mongoClient.getDatabase("Lib");
	
	public static int totalBooks = 0;
	public static List<Book> list = new ArrayList<Book>(); 

	private final int id;
	private final String name;
	private final String author;
	
	


	public Book(int id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}


	public void addBook() {

		
		Book book= new Book(id,name,author);
		list.add(book);
		totalBooks++; 

			JOptionPane.showMessageDialog(null,
				"Book Name:  " + book + "  added successful\n" + "Total Books: " + totalBooks);

	}


	public void deleteBook() {
		String del = "name";

		for (int i = 0; i < Book.list.size(); i++) {
			if (del.equals(this.list.get(i).getName())) {
				Book.list.remove(i);
			}
		}
		totalBooks--; // decrement total books
		JOptionPane.showMessageDialog(null, "Total Books: " + totalBooks);
	}


	public Book searchMethod(String bookName) {
		if (bookName == null) {
			return null;
		}
		for (Book tmp : this.list) {
			if (bookName.equals(tmp.deleteBook()))
				return tmp;
		}
		return null;
	}

	
}


