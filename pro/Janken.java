import jp.tdu.util.RandomNumber;
public class Janken {
	public static String getHandSign (int number) {
		String[] handSigns = {"グー", "チョキ", "パー"};
		return handSigns[number];
	}
	public static void printIntroduction () {
		for (int i = 0; i < 3; i++) {
			String message = getHandSign (i);
			System.out.println (message + ":" + i);
		}
	}
	public static void printInputMessage () {
		System.out.print ("ジャンケン番号を入力してください：");
	}
	public static void printResultMessage (int computer, int player) {
		int gu = 0;
		int cyoki = 1;
		int pa = 2;
		String message = "";
		if (player == computer) {
			message = "あいこ";
		} else if ((player == gu) && (computer == cyoki)) {
			message = "人間の勝ち";
		} else if ((player == gu) && (computer == pa)) {
			message = "計算機の勝ち";
		} else if ((player == cyoki) && (computer == gu)) {
			message = "計算機の勝ち";
		} else if ((player == cyoki) && (computer == pa)) {
			message = "人間の勝ち";
		} else if ((player == pa) && (computer == gu)) {
			message = "人間の勝ち";
		} else if ((player == pa) && (computer == cyoki)) {
			message = "計算機の勝ち";
		}
		System.out.println (message);
	}
	public static void pon (int player) {
		if ((player >= 0) && (player <= 2)) {
			String playerHand = Janken.getHandSign (player);
			System.out.println ("人間：" + playerHand);
			int computer = RandomNumber.nextInt (3);
			String computerHand = Janken.getHandSign (computer);
			System.out.println ("計算機：" + computerHand);
			Janken.printResultMessage (player, computer);
		} else {
			System.out.println ("0以上、2以下を入力してください");
		}
	}
}