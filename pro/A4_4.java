public class A4_4{
	public static void main (String[] args) {
		for (int i = 0; i < 4; i++) {
			paint ();
		}
	}
	public static void paint () {
		for (int i = 0; i < 5; i++) {
			System.out.print ("*");
		}
		System.out.println ();
	}
}