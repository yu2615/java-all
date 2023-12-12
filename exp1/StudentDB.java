import java.util.ArrayList;
import java.util.List;

public class StudentDB{
	public static List<Student>getList(){
		Student student1 = new Student("id3", "Ann");
		student1.setHeight(175);
		Student student2 = new Student("id2", "Susan");
		student2.setHeight(165);
		Student student3 = new Student("id1", "Paul");
		student3.setHeight(185);
		
		List<Student>list = new ArrayList<Student>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		
		return list;
	}
}