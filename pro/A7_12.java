public class A7_12 {
	public static void main (String[] args) {
		System.out.println (isSummer (5));
		System.out.println (isSummer (6));
	}
	public static boolean isSummer (int month) {
		boolean b = false;
		if (month == 6 || month == 7 || month == 8) {
			b = true;
		} else {
			b = false;
		}
		return b;
	}
}