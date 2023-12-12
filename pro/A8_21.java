public class A8_21 {
	public static void main (String[] args) {
		print (110);
		print (-5);
		print (65);
		print (30);
	}
	public static String getMessage (int score) {
		String message = "";
		if (score > 60 && score <= 100) {
			message = "‡Ši";
		} else if (score >= 100 || score < 0) {
			message = "”ÍˆÍŠO";
		} else if (score >= 0 && score < 60) {
			message = "•s‡Ši";
		}
		return message;
	}
	public static void print (int score) {
		System.out.print (score + " ");
		System.out.println (getMessage (score));
	}
}