import java.util.ArrayList;
public class Bookshelf {
	private ArrayList<Book> arrayList = new ArrayList<Book>();
	public Bookshelf() {
	}
	public void add (Book book) {
		this.arrayList.add(book);
	}
	public Book get (String isbn) {
		for (int i = 0; i < this.arrayList.size(); i++) {
			Book book = this.arrayList.get(i);
			String temp = book.getIsbn();
			if (temp.equals(isbn)) {
				return book;
			}
		}
		return null;
	}
	public int size () {
		return this.arrayList.size();
	}
}