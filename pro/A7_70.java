public class A7_70 {
	public static void main (String[] args) {
		int score = 60;
		boolean result1 = and (score >= 60, score < 70);
		System.out.println (result1);
		boolean result2 = or (score >= 90, score < 100);
		System.out.println (result2);
		boolean result3 = not (score == 60);
		System.out.println (result3);
	}
	public static boolean and (boolean b1, boolean b2) {
		return b1 && b2;
	}
	public static boolean or (boolean b1, boolean b2) {
		return b1 || b2;
	}
	public static boolean not (boolean b1) {
		return !b1;
	}
}