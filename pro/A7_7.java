public class A7_7 {
	public static void main (String[] args) {
		int a = 80;
		String message = "";
		if (a >= 90) {
			message = "評価はSです";
		} else if ((a >= 80) && (a < 90)) {
			message = "評価はAです";
		} else if ((a >= 70) && (a < 80)) {
			message = "評価はBです";
		} else if ((a >= 60) && (a < 70)) {
			message = "評価はCです";
		} else if ((a >= 0) && (a < 60)) {
			message = "評価はDです";
		}
		System.out.println (message);
	}
}