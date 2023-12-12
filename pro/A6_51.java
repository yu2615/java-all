public class A6_51 {
	public static void main (String[] args) {
		for (int i = 0; i < 3; i++) {
			String s1 = decorate (2 - i, " ");
			String s2 = getWord (i, "*", "+");
			System.out.println (s1 + s2);
		}
	}
	public static String decorate (int number, String deco) {
		String s = "";
		for (int i = 0; i < number; i++) {
			s = s + deco;
		}
		return s;
	}
	public static String getWord (int number, String deco, String contents) {
		return decorate (number, deco) + contents + decorate (number, deco);
	}
}