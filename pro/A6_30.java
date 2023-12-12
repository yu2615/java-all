public class A6_30 {
	public static void main (String[] args) {
		String response1 = getResponse (1, "*");
		String response2 = getResponse (2, " ");
		String response3 = getResponse (3, "+");
		System.out.println (response1 + response2 + response3);
	}
	public static String getResponse (int number, String message) {
		String s = "";
		for (int i = 0; i < number; i++) {
			s = s + message;
		}
		return s;
	}
}