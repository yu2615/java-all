import java.util.Collections;
import java.util.List;

public class Ex2_b4{
	public static void main(String[] args){
		List<Book>list = BookDB.getList();
		Book book5 = new Book("200","Guitarì¸ñÂ","Taro","Gèoî≈",1200);
		list.add(book5);
		
		Collections.sort(list, new ComparatorBookTitleIsbn());
		
		BookUtils.print(list);
	}
}