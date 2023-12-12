public class B4_7 {
	public static void main (String[] args) {
		Bookstack bookstack = new Bookstack();
		bookstack.add(new Book("978-407973-7125-3"
			,"Java言語プログラミングレッスン（上）"
			,"結城浩"
			,"ソフトバンククリエイティブ"));
		bookstack.add(new Book("978-407973-7126-0"
			,"Java言語プログラミングレッスン（下）"
			,"結城浩"
			,"ソフトバンククリエイティブ"));
		Book book = bookstack.get(1);
		String title = book.getTitle();
		System.out.println(title);
	}
}