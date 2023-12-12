public class Weather {
	public static String getInformation(int temperature) {
		String message = "";
		if (temperature >= 30) {
			message = "真夏日です（30度以上）";
		} else if ((temperature >= 25) && (temperature < 30)) {
			message = "夏日です（25度以上、30度未満）";
		} else if((temperature >= 0) && (temperature < 25)) {
			message = "0度以上、25度未満の日です";
		} else if(temperature < 0) {
			message = "真冬日です（0度未満）";
		}
		return message;
	}
}