import java.util.Comparator;

public class ComparatorStudentName implements Comparator<Student>{
	@Override
	public int compare(Student student1, Student student2){
		if(student1 == null || student2 == null){
			throw new ClassCastException();
		}
		return student1.getName().compareTo(student2.getName());
	}
}