public class B4_7 {
	public static void main (String[] args) {
		Bookstack bookstack = new Bookstack();
		bookstack.add(new Book("978-407973-7125-3"
			,"Java����v���O���~���O���b�X���i��j"
			,"����_"
			,"�\�t�g�o���N�N���G�C�e�B�u"));
		bookstack.add(new Book("978-407973-7126-0"
			,"Java����v���O���~���O���b�X���i���j"
			,"����_"
			,"�\�t�g�o���N�N���G�C�e�B�u"));
		Book book = bookstack.get(1);
		String title = book.getTitle();
		System.out.println(title);
	}
}