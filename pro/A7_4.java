public class A7_4 {
	public static void main (String[] args) {
		System.out.println (getSummerInformation (15));
		System.out.println (getSummerInformation (30));
	}
	public static String getSummerInformation (int temperature) {
		String message = "";
		if (temperature > 30) {
			message = "真夏日です（30度以上）";
		}else {
			message = "真夏日ではありません";
		}
		
		return message;
	}
}