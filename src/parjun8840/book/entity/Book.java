package parjun8840.book.entity;
//Comparable<Book> means will compare this class object with Book object.
//Comparable<Product> means will compare this Book object with Product object.
public class Book implements Comparable<Book> {
	private String title;
	private double price;
	public Book() {
	}
	public Book(String title, double price) {
		this.title = title;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public int compareTo(Book o) {
		if(this.getPrice() > o.getPrice()) {
			return 1;
		}else if(this.getPrice() < o.getPrice()) {
			return -1;
		}
		return 0;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
	

}
