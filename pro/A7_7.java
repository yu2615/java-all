public class A7_7 {
	public static void main (String[] args) {
		int a = 80;
		String message = "";
		if (a >= 90) {
			message = "•]‰¿‚ÍS‚Å‚·";
		} else if ((a >= 80) && (a < 90)) {
			message = "•]‰¿‚ÍA‚Å‚·";
		} else if ((a >= 70) && (a < 80)) {
			message = "•]‰¿‚ÍB‚Å‚·";
		} else if ((a >= 60) && (a < 70)) {
			message = "•]‰¿‚ÍC‚Å‚·";
		} else if ((a >= 0) && (a < 60)) {
			message = "•]‰¿‚ÍD‚Å‚·";
		}
		System.out.println (message);
	}
}