public class A7_3 {
	public static void main (String[] args) {
		System.out.println (getWeatherInformation (20));
		System.out.println (getWeatherInformation (-9));
	}
	public static String getWeatherInformation (int temperature) {
		String message = "";
		if (temperature < 0) {
			message = "真冬日です（0未満）";
		}else {
			message = "真冬日ではありません";
		}
		return message;
	}
}