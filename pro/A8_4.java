import jp.tdu.util.KeyboardReader;
public class A8_4 {
	public static void main (String[] args) {
		System.out.print ("¬Ñ:");
		int a = KeyboardReader.readInt();
		if ( ( a >= 0 ) && ( a <= 100 )) {
			System.out.println(A8_4.getExamInformation(a));
		} else {
			System.out.println ("0“_ˆÈãA100“_ˆÈ‰º‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		} 
	}
	public static String getExamInformation (int score) {
		String message = "";
		if (score >= 90) {
			message = "•]‰¿‚ÍS‚Å‚·";
		} else if (score >= 80) {
			message = "•]‰¿‚ÍA‚Å‚·";
		} else if (score >= 70) {
			message = "•]‰¿‚ÍB‚Å‚·";
		} else if (score >= 60) {
			message = "•]‰¿‚ÍC‚Å‚·";
		} else if (score >= 0) {
			message = "•]‰¿‚ÍD‚Å‚·";
		}
		return message;
	}
}