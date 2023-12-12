import java.util.ArrayList;
import java.util.List;

public class Ex2_b5{
	public static void main(String[] args){
		List<Book>list = BookDB.getList();
		BookUtils.print(list);
		
		String key = args[0];
		System.out.println("search key:" + key);
		List<Book>list2 = search(list, key);
		BookUtils.print(list2);
	}
	public static List<Book> search(List<Book> list,String key){
		
	}
}