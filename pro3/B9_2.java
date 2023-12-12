public class B9_2 {
	public static void main (String[] args) {
		SubEducator educator1 = new SubEducator ("19AJ088", "takahashi");
		SubEducator educator2 = new SubEducator ("19AJ091", "takizawa");
		System.out.println(educator1.getId() + " " + educator1.getName());
		System.out.println(educator2.getId() + " " + educator2.getName());
	}
}