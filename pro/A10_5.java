import jp.tdu.util.KeyboardReader;
public class A10_5 {
	public static void main (String[] args) {
		Janken.printIntroduction ();
		Janken.printInputMessage ();
		int player = KeyboardReader.readInt ();
		if ((player >= 0) && (player <= 2)) {
			System.out.println ("lŠÔF" + Janken.getHandSign (player));
		} else {
			System.out.println ("0ˆÈãA2ˆÈ‰º‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		}
	}
}