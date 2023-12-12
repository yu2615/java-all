public class B2_22 {
	public static void main (String[] args) {
		Instructor inst1 = new Instructor("00");
		
		inst1.setSalary(300000);
		inst1.setName("kohama");
		
		System.out.print (inst1.getId() + " ");
		System.out.print (inst1.getName() + " ");
		System.out.println (inst1.getSalary());
	}
}