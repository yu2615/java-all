import java.util.List;

public class BookUtils{
	public static void print(List<Book>list){
		for(Book book : list){
			BookUtils.print(book);
		}
	}
	public static void print(Book book){
		System.out.print(book.getIsbn() + " ");
		System.out.print(book.getTitle() + " ");
		System.out.print(book.getAuthor() + " ");
		System.out.print(book.getPublisher() + " ");
		System.out.print(book.getPrice() + " ");
		System.out.println();
	}
}