public class B4_6 {
	public static void main (String[] args) {
		Bookshelf bookshelf = new Bookshelf();
		bookshelf.add(new Book("978-407973-7125-3"
			,"Java����v���O���~���O���b�X���i��j"
			,"����_"
			,"�\�t�g�o���N�N���G�C�e�B�u"));
		bookshelf.add(new Book("978-407973-7126-0"
			,"Java����v���O���~���O���b�X���i���j"
			,"����_"
			,"�\�t�g�o���N�N���G�C�e�B�u"));
		
		Book book = bookshelf.get("978-407973-7125-3");
		System.out.println(book.getTitle());
	}
}