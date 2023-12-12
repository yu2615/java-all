import jp.tdu.util.KeyboardReader;
import jp.tdu.util.RandomNumber;
public class Kazuate {
	public static String getResultMessage (int player, int computer) {
		String message = "";
		if (player > computer) {
			return "入力値が大きいです";
		} else if (player < computer) {
			return "入力値が小さいです";
		} else if (player == computer) {
			return "正解です";
		}
		return "";
	}
	public static void play () {
		System.out.print ("0以上、2以下を入力してください：");
		int player = KeyboardReader.readInt ();
		if ((player < 0) || (player > 2)) {
			System.out.println ("入力された値が間違ってます");
			return ;
		}
		int computer = RandomNumber.nextInt(3);
		System.out.println ("計算機：" + computer);
		System.out.println (getResultMessage (player, computer));
	}
}