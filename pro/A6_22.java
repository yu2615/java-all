public class A6_22 {
	public static void main (String[] args) {
		for(int i = 0; i < 6; i++) {
			System.out.println (getResponse(i % 3, "*"));
			//i % 3‚Í—]‚èB1 % 3 = 1‚Å‚·B
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