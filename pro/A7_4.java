public class A7_4 {
	public static void main (String[] args) {
		System.out.println (getSummerInformation (15));
		System.out.println (getSummerInformation (30));
	}
	public static String getSummerInformation (int temperature) {
		String message = "";
		if (temperature > 30) {
			message = "�^�ē��ł��i30�x�ȏ�j";
		}else {
			message = "�^�ē��ł͂���܂���";
		}
		
		return message;
	}
}