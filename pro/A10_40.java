import jp.tdu.util.RandomNumber;
import jp.tdu.util.KeyboardReader;
public class A10_40 {
	public static void main (String[] args) {
		System.out.println ("���Əo���ł���񂯂�������Ȃ��܂�");
		int computer = RandomNumber.nextInt(3);
		String message = getStartMessage ();
		System.out.println (message);
		System.out.print ("�v�Z�@�F");
		System.out.println (Janken.getHandSign (computer));
		Janken.printIntroduction ();
		Janken.printInputMessage ();
		int player = KeyboardReader.readInt ();
		System.out.print ("�l�ԁF");
		System.out.println (Janken.getHandSign (player));
		Janken.printResultMessage (player, computer);
	}
	public static String getStartMessage () {
		String[] message = {
			"�u�����Ă��������v�u����񂯂�v�u�|���v",
			"�u���������Ă��������v�u����񂯂�v�u�|���v",
			"�u�����Ă��������v�u����񂯂�v�u�|���v"
		};
		int number = RandomNumber.nextInt (3);
		return message[number];
	}
}