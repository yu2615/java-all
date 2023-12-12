public class A6_52 {
	public static void main (String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println (calculate (2, i));
		}
	}
	public static int calculate (int number, int power) {
		int result = 1;
		for (int i = 0; i < power; i++) {
			result = result * number;
		}
		return result;
	}
}