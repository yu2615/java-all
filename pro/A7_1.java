public class A7_1 {
	public static void main(String[] args) {
		printWeatherInformation (10);
		printWeatherInformation (-1);
	}
	public static void printWeatherInformation (int temperature) {
		String message = "";
		if (temperature < 0) {
			message = "�^�~���ł��i0�����j";
		}else {
			message = "�^�~���ł͂���܂���";
		}
		
		System.out.println (message);
	}
}