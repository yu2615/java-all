public class Weather {
	public static String getInformation(int temperature) {
		String message = "";
		if (temperature >= 30) {
			message = "�^�ē��ł��i30�x�ȏ�j";
		} else if ((temperature >= 25) && (temperature < 30)) {
			message = "�ē��ł��i25�x�ȏ�A30�x�����j";
		} else if((temperature >= 0) && (temperature < 25)) {
			message = "0�x�ȏ�A25�x�����̓��ł�";
		} else if(temperature < 0) {
			message = "�^�~���ł��i0�x�����j";
		}
		return message;
	}
}