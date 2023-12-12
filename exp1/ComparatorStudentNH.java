import java.util.Comparator;

public class ComparatorStudentNH implements Comparator<Student>{
	@Override
	public int compare(Student student1, Student student2){
		if(student1 == null || student2 == null){
			throw new ClassCastException();
		}
		int n = student1.getName().compareTo(student2.getName());
		if(n != 0){
			return n;
		}
		int h = student1.getHeight() - student2.getHeight();
		return h;
	}
}