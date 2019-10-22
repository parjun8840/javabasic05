package parjun8840.book.ui;

import parjun8840.book.entity.Book;
import parjun8840.book.util.Utility;

public class SortExample {

public static void main(String[] args) {
 Book[] books = new Book[4];
 books[0] =  new Book("Spring in Action", 1230.01);
 books[1] =  new Book("Java in Action", 980.00);
 books[2] =  new Book("Go in Action", 1500.10);
 books[3] =  new Book("Node in Action", 765.45);
 
 Utility.sort(books);
 for (Book b : books) {
	 //System.out.println(b); Internally it invokes toString() and we haven't implemented toString() in Book.
	 //So it goes to the super class "Object" and invokes it toString method.
	 //Output would be => parjun8840.book.entity.Book@7852e922
	 //Go to Book class and implement: toString() method
	 
	 System.out.println(b);
	 
 }
 //String class is also implementing comparable interface like our Book class.
 String[] names = {"George", "Brad", "Angelina", "Lee", "Brandon"};
 
 Utility.sort(names);
 for (String name : names) {
	 System.out.println(name);
	 
 }
	}

}
