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
			message = "���i";
		} else if (score >= 100 || score < 0) {
			message = "�͈͊O";
		} else if (score >= 0 && score < 60) {
			message = "�s���i";
		}
		return message;
	}
	public static void print (int score) {
		System.out.print (score + " ");
		System.out.println (getMessage (score));
	}
}