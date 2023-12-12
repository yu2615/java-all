public class A8_30 {
	public static void main (String[] args) {
		int[] scores = {70, 75, 60, 80};
		System.out.println (getSum (scores));
	}
	public static int getSum (int[] list) {
		int sum = 0;
		for (int i = 0; i < list.length; i++) {
			sum = sum + list [i];
		}
		return sum;
	}
}