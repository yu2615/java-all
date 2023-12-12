import java.util.List;

public class StudentUtils{
	public static void print(List<Student>list){
		for(Student student : list){
			StudentUtils.print(student);
		}
	}
	public static void print(Student student){
		System.out.print(student.getId() + " ");
		System.out.print(student.getName() + " ");
		System.out.print(student.getHeight() + "");
		System.out.println();
	}
}