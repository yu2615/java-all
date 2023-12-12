public class A5_5 {
	public static void main (String[] args) {
		//paint (1);
		//paint (2);
		//paint (3);
		//paint (4);
		for (int i = 0; i < 4; i++) {
			paint (i + 1);
		}
	}
	public static void paint (int number) {
		for (int i = 0; i < number; i++) {
			System.out.print ("*");
		}
		System.out.println ();
	}
}