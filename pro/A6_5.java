public class A6_5 {
	public static void main (String[] args) {
		System.out.println (calculate (5));
		System.out.println (calculate (10));
	}
	public static int calculate (int number) {
		int sum = 0;
		for (int i = 0; i < number; i++) {
			sum = sum + i + 1;
		}
		return sum;
	}
}