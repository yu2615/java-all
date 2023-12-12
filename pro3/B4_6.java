public class B4_6 {
	public static void main (String[] args) {
		Bookshelf bookshelf = new Bookshelf();
		bookshelf.add(new Book("978-407973-7125-3"
			,"Java言語プログラミングレッスン（上）"
			,"結城浩"
			,"ソフトバンククリエイティブ"));
		bookshelf.add(new Book("978-407973-7126-0"
			,"Java言語プログラミングレッスン（下）"
			,"結城浩"
			,"ソフトバンククリエイティブ"));
		
		Book book = bookshelf.get("978-407973-7125-3");
		System.out.println(book.getTitle());
	}
}