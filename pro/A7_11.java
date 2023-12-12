public class A7_11 {
	public static void main (String[] args) {
		boolean ice = false;
		System.out.println (getState (ice));
		ice = true;
		System.out.println (getState (ice));
	}
	public static String getState (boolean ice) {
		String message = ""; 
		if (ice) {
			message = "•X‚Å‚·";
		} else {
			message = "…‚Å‚·";
		}
		return message;
	}
}