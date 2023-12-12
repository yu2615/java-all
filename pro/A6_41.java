public class A6_41 {
	public static void main (String[] args) {
		for (int i = 0; i < 6; i++) {
			System.out.println (getSum (i % 3));
		}
	}
	public static int getSum (int number) {
		int sum = 0;
		for (int i = 0; i < number; i++) {
			sum = sum + (i + 1);
		}
		return sum;
	}
}