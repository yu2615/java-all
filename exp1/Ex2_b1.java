import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex2_b1{
	public static void main(String[] args){
		List<Book>list = BookDB.getList();
		
		Map<String, Book>map = new HashMap<String, Book>();
		for(Book book : list){
			map.put(book.getIsbn(), book);
		}
		
		for(String key : map.keySet()){
			Book book = map.get(key);
			BookUtils.print(book);
		}
		
		String isbn = args[0];
		System.out.println("search isbn:" + isbn);
		Book book = map.get(isbn);
		if(book == null){
			System.out.println("ˆê’v‚·‚éƒf[ƒ^‚ª‚ ‚è‚Ü‚¹‚ñ");
		}else{
			BookUtils.print(book);
		}
	}
}