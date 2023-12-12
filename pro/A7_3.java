public class A7_3 {
	public static void main (String[] args) {
		System.out.println (getWeatherInformation (20));
		System.out.println (getWeatherInformation (-9));
	}
	public static String getWeatherInformation (int temperature) {
		String message = "";
		if (temperature < 0) {
			message = "^“~“ú‚Å‚·i0–¢–žj";
		}else {
			message = "^“~“ú‚Å‚Í‚ ‚è‚Ü‚¹‚ñ";
		}
		return message;
	}
}