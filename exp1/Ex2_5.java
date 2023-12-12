import java.util.Collections;
import java.util.List;

public class Ex2_5{
	public static void main(String[] args){
		List<Student>list = StudentDB.getList();
		
		Student student4 = new Student("id4", "Paul");
		student4.setHeight(170);
		list.add(student4);
		
		Collections.sort(list, new ComparatorStudentNH());
		
		StudentUtils.print(list);
	}
}