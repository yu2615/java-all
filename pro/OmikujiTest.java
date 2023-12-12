public class OmikujiTest {
	public static void main (String[] args) {
		String welcome = Omikuji.getWelcomeMessage ("Pro Taro");
		System.out.println (welcome);
		String fortune = Omikuji.getMessage (0);
		System.out.println (fortune);
		String message = Omikuji.getRandomMessage ();
		System.out.println (message);
	}
}