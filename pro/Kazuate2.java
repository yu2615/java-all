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
			System.out.print (start + "�ȏ�A" + end + "��������͂��Ă��������F");
			player = KeyboardReader.readInt ();
			if (player < start || player > end) {
				System.out.println ("���͂��ꂽ�l���Ԉ���Ă��܂�");
			} else {
				System.out.println (Kazuate.getResultMessage (player, computer));
			}
		}
	}
}