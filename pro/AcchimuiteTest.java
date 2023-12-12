public class AcchimuiteTest {
	public static void main (String[] args) {
		Acchimuite.printIntroduction ();
		int player = Acchimuite.getPlayerNumber();
		System.out.println ("player:" + player);
		int computer = Acchimuite.getComputerNumber();
		System.out.println ("computer:" + computer);
		String message = Acchimuite.getYouVsCom (player, computer);
		System.out.println ("message:" + message);
	}
}