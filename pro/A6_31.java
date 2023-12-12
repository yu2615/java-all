public class A6_31 {
	public static void main (String[] args) {
		for (int i = 0; i < 2; i++) {
			String s1 = getResponse (2 - (i + 1), " ");
			String s2 = getResponse (2 * i + 1, "*");
			System.out.println(s1 + s2);
		}
	}
	public static String getResponse (int number,String message) {
		String s = "";
		for (int i = 0; i < number; i++) {
			s = s +message;
		}
		return s;
	}
}