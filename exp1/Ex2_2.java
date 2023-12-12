import java.util.Collections;
import java.util.List;

public class Ex2_2{
	public static void main(String[] args){
		List<Student>list = StudentDB.getList();
		
		Collections.sort(list);
		
		StudentUtils.print(list);
	}
}