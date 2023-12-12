public class B2_21 {
	public static void main (String[] args) {
		Teacher teacher1 = new Teacher("03","nakamura");
		Teacher teacher2 = new Teacher("02","tanaka");
		
		teacher1.setSalary(200000);
		
		System.out.print (teacher1.getId() + " ");
		System.out.print (teacher1.getName() + " ");
		System.out.println (teacher1.getSalary());
		
		System.out.print (teacher2.getId() + " ");
		System.out.print (teacher2.getName() + " ");
		System.out.println (teacher2.getSalary());
	}
}