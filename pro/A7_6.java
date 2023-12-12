public class A7_6 {
	public static void main (String[] args) {
		boolean b1 = (5 != 5);
		System.out.println (!b1);
		boolean b2 = true && false;
		System.out.println (b2);
		boolean b3 = !b1 || b2;
		System.out.println (b3);
		int a = 3;
		boolean b4 = (a >= 0) && (a <= 5);
		System.out.println (b4);
	}
}