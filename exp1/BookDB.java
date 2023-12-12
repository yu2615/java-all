import java.util.ArrayList;
import java.util.List;

public class BookDB{
	public static List<Book> getList(){
		Book book1 = new Book("987", "Organ入門", "Taro", "G出版", 1500);
		Book book2 = new Book("789", "Guitar入門", "Jiro", "D出版", 2500);
		Book book3 = new Book("456", "Jazz聴く", "Santaro", "F出版", 3000);
		Book book4 = new Book("123", "Piano入門", "Hanako", "E出版", 1000);
		
		List<Book>list = new ArrayList<Book>();
		list.add(book1);
		list.add(book2);
		list.add(book3);
		list.add(book4);
		
		return list;
	}
}