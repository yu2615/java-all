import java.util.ArrayList;
import java.util.List;

public class BookDB{
	public static List<Book> getList(){
		Book book1 = new Book("987", "Organ����", "Taro", "G�o��", 1500);
		Book book2 = new Book("789", "Guitar����", "Jiro", "D�o��", 2500);
		Book book3 = new Book("456", "Jazz����", "Santaro", "F�o��", 3000);
		Book book4 = new Book("123", "Piano����", "Hanako", "E�o��", 1000);
		
		List<Book>list = new ArrayList<Book>();
		list.add(book1);
		list.add(book2);
		list.add(book3);
		list.add(book4);
		
		return list;
	}
}