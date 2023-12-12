public class B9_3 {
	public static void main (String[] args) {
		SubEducator educator1 = new SubEducator("19AJ088", "takahashi");
		SubEducator educator2 = new SubEducator("19AJ091", "takizawa");
		educator1.setPassword("123");
		educator2.setPassword("456");
		System.out.println(educator1.getId() + " " + educator1.getName() + " " + educator1.getPassword());
		System.out.println(educator2.getId() + " " + educator2.getName() + " " + educator2.getPassword());
	}
}