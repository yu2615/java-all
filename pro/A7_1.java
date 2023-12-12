public class A7_1 {
	public static void main(String[] args) {
		printWeatherInformation (10);
		printWeatherInformation (-1);
	}
	public static void printWeatherInformation (int temperature) {
		String message = "";
		if (temperature < 0) {
			message = "^“~“ú‚Å‚·i0–¢–žj";
		}else {
			message = "^“~“ú‚Å‚Í‚ ‚è‚Ü‚¹‚ñ";
		}
		
		System.out.println (message);
	}
}