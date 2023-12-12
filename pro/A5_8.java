public class A5_8 {
	public static void main (String[] args) {
		paint (2, "*");
		paint (3, "+");
	}
	public static void paint (int number, String message) {
		for (int i = 0; i < number; i++) {
			System.out.print (message);
		}
		System.out.println ();
	}
}