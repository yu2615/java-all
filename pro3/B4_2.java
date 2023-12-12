public class B4_2 {
	public static void main (String[] args) {
		Teacher teacher = new Teacher("SIE01","nakamura");
		teacher.setSalary(200000);
		System.out.println(teacher.getId());
		System.out.println(teacher.getName());
		System.out.println(teacher.getSalary());
	}
}