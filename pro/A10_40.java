import jp.tdu.util.RandomNumber;
import jp.tdu.util.KeyboardReader;
public class A10_40 {
	public static void main (String[] args) {
		System.out.println ("あと出しでじゃんけんをおこないます");
		int computer = RandomNumber.nextInt(3);
		String message = getStartMessage ();
		System.out.println (message);
		System.out.print ("計算機：");
		System.out.println (Janken.getHandSign (computer));
		Janken.printIntroduction ();
		Janken.printInputMessage ();
		int player = KeyboardReader.readInt ();
		System.out.print ("人間：");
		System.out.println (Janken.getHandSign (player));
		Janken.printResultMessage (player, computer);
	}
	public static String getStartMessage () {
		String[] message = {
			"「負けてください」「じゃんけん」「ポン」",
			"「引き分けてください」「じゃんけん」「ポン」",
			"「勝ってください」「じゃんけん」「ポン」"
		};
		int number = RandomNumber.nextInt (3);
		return message[number];
	}
}