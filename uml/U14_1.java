public class U14_1{
	public static void main(String[] args){
		Student student = new Student("s001", "Taro");
		StudentManager studentManager = new StudentManager(student);
		//
		studentManager.print();
	}
}