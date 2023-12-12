import java.util.Collections;
import java.util.List;

public class Ex2_3{
	public static void main(String[] args){
		List<Student>list = StudentDB.getList();
		
		Collections.sort(list, new ComparatorStudentName());
		
		StudentUtils.print(list);
	}
}