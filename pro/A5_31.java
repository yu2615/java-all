public class A5_31 {
	public static void main (String[] args) {
		for (int i = 0; i < 3; i++) {
			paint (i, " ");
			paint (3 - i, "*");
			System.out.println ();
		}
	}
	public static void paint (int number, String message) {
		for (int i = 0; i < number; i++) {
			System.out.print (message);
		}
	}
}