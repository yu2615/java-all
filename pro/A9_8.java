public class A9_8 {
	public static void main (String[] args) {
		for (int i = 0; i < 3; i++) {
		String message = Janken.getHandSign (i);
		System.out.println (message + ":" + i);
		}
	}
}