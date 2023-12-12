public class B9_1 {
	public static void main (String[] args) {
		Educator educator1 = new Educator("19AJ088","takahashi");
		Educator educator2 = new Educator("19AJ091", "takizawa");
		System.out.println (educator1.getId() + " " + educator1.getName());
		System.out.println (educator2.getId() + " " + educator2.getName());
	}
}