package bookmgmt;

public class Book {
	private String title;
	String author;
	double price;
	double rating;

	public Book(String title, String author, double price, double rating) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.rating = rating;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", rating=" + rating + "]";
	}
}
