import jp.tdu.util.KeyboardReader;
import jp.tdu.util.RandomNumber;
public class Acchimuite {
	public static String getMessage (int number) {
		String[] message = {"ª", "¨", "«", "©"}; 
		return message[number];
	}
	public static void printIntroduction () {
		for (int i = 0; i < 4; i++) {
			System.out.println (i + ":" + getMessage(i));
		}
	}
	public static int getPlayerNumber () {
		return 0;
	}
	public static int getComputerNumber () {
		return 0;
	}
	public static String getYouVsCom (int player, int computer) {
		return "";
	}
	public static String getResult (int player, int computer) {
		return "";
	}
	public static void hoi () {
		
	}
}