import java.util.ArrayList;
public class Bookstack {
	private ArrayList<Book> arrayList = new ArrayList<Book>();
	public Bookstack() {
	}
	public void add (Book book) {
		this.arrayList.add(book);
	}
	public Book get (int i) {
		return this.arrayList.get(i);
	}
	public int size () {
		return this.arrayList.size();
	}
	public Book remove (int i) {
		return this.arrayList.remove(i);
	}
}