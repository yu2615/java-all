public class A6_4 {
	public static void main (String[] args) {
		String s = getMessage (3);
		System.out.println (s);
		String s1 = getMessage (5);
		System.out.println (s1);
	}
	public static String getMessage (int number) {
		String message = "";
		for (int i = 0; i < number; i++) {
			message = message + "*";
		}
		return message;
	}
}