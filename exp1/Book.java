public class Book implements Comparable<Book>{
	private String isbn;
	private String title;
	private String author;
	private String publisher;
	private int price;
	public Book(String isbn,String title,String author,String publisher,int price){
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
	public String getIsbn(){
		return this.isbn;
	}
	public String getTitle(){
		return this.title;
	}
	public String getAuthor(){
		return this.author;
	}
	public String getPublisher(){
		return this.publisher;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public int getPrice(){
		return this.price;
	}
	@Override
	public int compareTo(Book book){
		if(book == null){
			throw new ClassCastException();
		}
		return this.getIsbn().compareTo(book.getIsbn());
	}
	@Override
	public int hashCode(){
		if(this.getIsbn() == null){
			return 0;
		}
		return this.getIsbn().hashCode();
	}
	@Override
	public boolean equals(Object o){
		if(o instanceof Book){
			Book book = (Book)o;
			return this.getIsbn().equals(book.getIsbn());
		}
		return false;
	}
}