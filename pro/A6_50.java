public class A6_50 {
	public static void main (String[] args) {
		System.out.println (getWord (2, "*", " "));
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