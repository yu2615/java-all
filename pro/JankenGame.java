import jp.tdu.util.KeyboardReader;
public class JankenGame {
	public static void main (String[] args) {
		Janken.printIntroduction ();
		Janken.printInputMessage ();
		int player = KeyboardReader.readInt ();
		Janken.pon (player);
	}
}