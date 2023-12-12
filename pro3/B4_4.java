import java.util.ArrayList;
public class B4_4 {
	public static void main (String[] args) {
		ArrayList<Book> list = new ArrayList<Book>();
		list.add(new Book("978-407973-7125-3"
			,"Java言語プログラミングレッスン（上）"
			,"結城浩"
			,"ソフトバンククリエイティブ"));
		list.add(new Book("978-407973-7126-0"
			,"Java言語プログラミングレッスン（下）"
			,"結城浩"
			,"ソフトバンククリエイティブ"));
		
		Book book = list.get(0);
		String title = book.getTitle();
		System.out.println(title);
	}
}