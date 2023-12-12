public class A5_21 {
	public static void main (String[] args) {
		paint2 (2);
		paint1 (1);
		System.out.println ();
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