import java.util.Collections;
import java.util.List;

public class Ex2_b2{
	public static void main(String[] args){
		List<Book>list = BookDB.getList();
		
		Collections.sort(list);
		
		BookUtils.print(list);
	}
}