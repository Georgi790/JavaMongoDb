package MyServ;


import java.util.*;
import javax.swing.JOptionPane;

public class Book {
public static int totalBooks = 0;
public static List<Book> list = new ArrayList<Book>();      //create ArrayLis;

//default constructor
public Book() {
}
//add book method
public void addBook() {

    //show Input dialogue box to take input
   
    String bookName = "test";
    String authorName = "test";

    //add books data to ArrayList
    Book newBook = new Book();
    list.add(newBook);
    totalBooks++; //increment Total books

    //show notification after successful added book
    JOptionPane.showMessageDialog(null, "Book Name:  " +bookName + "  added successful\n" + "Total Books: " +totalBooks);
    	

}

//delete book method
public void deleteBook() {
    String del = "test";

   for (int i = 0; i < Book.list.size() ; i++){
       if(del.equals(this.list.get(i).getBookName())){
           Book.list.remove(i);
       }
   }
    totalBooks--; //decrement total books
    JOptionPane.showMessageDialog(null, "Total Books: " +totalBooks);
}

private Object getBookName() {
	// TODO Auto-generated method stub
	return null;
}
public Book searchMethod(String bookName){
if(bookName == null){
    return null;
}
for(Book tmp : this.list){
    if(bookName.equals(tmp.Book()))
        return tmp;
}
return null;
}
private Object Book() {
	// TODO Auto-generated method stub
	return null;
}
}

class BookAddDel {
public static void main(String[] args) {
	Book obj = new Book();
    obj.addBook();
    obj.deleteBook();
}
}