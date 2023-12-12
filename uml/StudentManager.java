public class StudentManager{
	private Student student;
	public StudentManager(Student student){
		this.student = student;
	}
	public String getString(){
		return this.student.getId() + " " + this.student.getName();
	}
	public void print(){
		System.out.println(this.getString());
	}
}