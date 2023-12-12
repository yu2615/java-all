import java.util.Collections;
import java.util.List;

public class Ex2_b3{
	public static void main(String[] args){
		List<Book>list = BookDB.getList();
		
		Collections.sort(list,new ComparatorBookPublisher());
		
		BookUtils.print(list);
	}
}