import jp.tdu.util.RandomNumber;
public class Omikuji {
	public static String getWelcomeMessage (String name) {
		String c = "";
		c = name + "‚³‚ñ‚Ì¡“ú‚Ì‰^¨‚Í";
		return c;
	}
	public static String getMessage (int number) {
		String[] message = {"‘å‹g", "’†‹g", "¬‹g", "‹g", "––‹g", "‹¥", "‘å‹¥"} ;
		return message[number];
	}
	public static String getRandomMessage () {
		int a = RandomNumber.nextInt(7);
		return getMessage(a) + "‚Å‚·";
	}
	public static void consult (String name) {
		System.out.print (getWelcomeMessage(name));
		System.out.println (getRandomMessage()); 
	}
}