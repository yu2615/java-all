import jp.tdu.util.KeyboardReader;
public class A10_5 {
	public static void main (String[] args) {
		Janken.printIntroduction ();
		Janken.printInputMessage ();
		int player = KeyboardReader.readInt ();
		if ((player >= 0) && (player <= 2)) {
			System.out.println ("人間：" + Janken.getHandSign (player));
		} else {
			System.out.println ("0以上、2以下を入力してください");
		}
	}
}