public class A10_20 {
	public static void main (String[] args) {
		System.out.println ("あと出しでじゃんけんをおこないます");
		Janken.printIntroduction ();
		String message = "「負けてください」　「じゃんけん」　「ポン」";
		int computer = 0;
		int player = 1;
		System.out.println (message);
		System.out.print ("計算機:");
		System.out.println (Janken.getHandSign (computer));
		System.out.print ("人間:");
		System.out.println (Janken.getHandSign (player));
		System.out.println (getResultMessage (player, computer));
	}
	public static String getResultMessage (int player, int computer) {
		int result = ((computer - player) + 3) % 3; // % は余り
		String[] resultMessage = {"あいこ", "勝ち", "負け"};
		return resultMessage [result];
	}
}