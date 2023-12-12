import jp.tdu.util.KeyboardReader;
import jp.tdu.util.RandomNumber;
public class Kazuate2 {
	public static void main (String[] args) {
		Kazuate2.play (0, 100);
	}
	public static void play (int start, int end) {
		int computer = start + RandomNumber.nextInt (end - start);
		int player = start - 1;
		for (; player != computer;) {
			System.out.print (start + "ˆÈãA" + end + "–¢–‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢F");
			player = KeyboardReader.readInt ();
			if (player < start || player > end) {
				System.out.println ("“ü—Í‚³‚ê‚½’l‚ªŠÔˆá‚Á‚Ä‚¢‚Ü‚·");
			} else {
				System.out.println (Kazuate.getResultMessage (player, computer));
			}
		}
	}
}