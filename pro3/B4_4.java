import java.util.ArrayList;
public class B4_4 {
	public static void main (String[] args) {
		ArrayList<Book> list = new ArrayList<Book>();
		list.add(new Book("978-407973-7125-3"
			,"Java����v���O���~���O���b�X���i��j"
			,"����_"
			,"�\�t�g�o���N�N���G�C�e�B�u"));
		list.add(new Book("978-407973-7126-0"
			,"Java����v���O���~���O���b�X���i���j"
			,"����_"
			,"�\�t�g�o���N�N���G�C�e�B�u"));
		
		Book book = list.get(0);
		String title = book.getTitle();
		System.out.println(title);
	}
}