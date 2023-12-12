import java.util.Comparator;

public class ComparatorBookPublisher implements Comparator<Book>{
	@Override
	public int compare(Book book1,Book book2){
		if(book1 == null || book2 == null){
			throw new ClassCastException();
		}
		return 0;
	}
}