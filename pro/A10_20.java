public class A10_20 {
	public static void main (String[] args) {
		System.out.println ("���Əo���ł���񂯂�������Ȃ��܂�");
		Janken.printIntroduction ();
		String message = "�u�����Ă��������v�@�u����񂯂�v�@�u�|���v";
		int computer = 0;
		int player = 1;
		System.out.println (message);
		System.out.print ("�v�Z�@:");
		System.out.println (Janken.getHandSign (computer));
		System.out.print ("�l��:");
		System.out.println (Janken.getHandSign (player));
		System.out.println (getResultMessage (player, computer));
	}
	public static String getResultMessage (int player, int computer) {
		int result = ((computer - player) + 3) % 3; // % �͗]��
		String[] resultMessage = {"������", "����", "����"};
		return resultMessage [result];
	}
}