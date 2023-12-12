public class A6_40 {
	public static void main (String[] args) {
		for (int i = 0; i < 6; i++) {
			System.out.println (getResponse (i / 3, "*"));
		}
	}
	public static String getResponse (int number, String message) {
		String s = "";
		for (int i = 0; i < number; i++) {
			s = s + message;
		}
		return s;
	}
}