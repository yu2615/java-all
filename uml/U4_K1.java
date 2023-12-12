public class U4_K1{
	public static void main(String[] args){
		StudentList studentList = new StudentList();
		studentList.add(new Student("s001","Taro"));
		studentList.add(new Student("s002","Hanako"));
		studentList.add(new Student("s003","Jiro"));
		
		Student student = StudentList.get();
		String name = student.getName();
		String id = student.getId();
		print(studentList);
	} 
	public static void print(StudentList studentList){
		System.out.print(Student.getid());
		System.out.println(" " + Student.getName());
	}
}