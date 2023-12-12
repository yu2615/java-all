public class A5_22 {
	public static void main (String[] args) {
		for (int i = 0; i < 3; i++) {
			paint2 (i);
			paint1 (3 - i);
			System.out.println ();
		}
	}
	public static void paint1 (int number) {
		for (int i = 0; i < number; i++) {
			System.out.print ("*");
		}
	}
	public static void paint2 (int number) {
		for (int i = 0; i < number; i++) {
			System.out.print (" ");
		}
	}
}