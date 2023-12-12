public class Book {
	private String isbn;
	private String title;
	private String author;
	private String publisher;
	public Book (String isbn, String title, String author, String publisher) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	public String getIsbn () {
		return this.isbn;
	}
	public String getTitle () {
		return this.title;
	}
	public String getAuthor () {
		return this.author;
	}
	public String getPublisher () {
		return this.publisher;
	}
}