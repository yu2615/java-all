import jp.tdu.util.KeyboardReader;
import jp.tdu.util.RandomNumber;
public class Kazuate {
	public static String getResultMessage (int player, int computer) {
		String message = "";
		if (player > computer) {
			return "���͒l���傫���ł�";
		} else if (player < computer) {
			return "���͒l���������ł�";
		} else if (player == computer) {
			return "�����ł�";
		}
		return "";
	}
	public static void play () {
		System.out.print ("0�ȏ�A2�ȉ�����͂��Ă��������F");
		int player = KeyboardReader.readInt ();
		if ((player < 0) || (player > 2)) {
			System.out.println ("���͂��ꂽ�l���Ԉ���Ă܂�");
			return ;
		}
		int computer = RandomNumber.nextInt(3);
		System.out.println ("�v�Z�@�F" + computer);
		System.out.println (getResultMessage (player, computer));
	}
}