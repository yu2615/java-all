public class AccimuiteTest {
	public static void main (String[] args) {
		Accimuite.printIntroduction ();
		int player = Accimuite.getPlayerNumber();
		System.out.println ("player:" + player);
		int computer = Acchimuite.getComputerNumber();
		System.out.println ("computer:" + computer);
		String message = Acchimuite.getYouVsCom (player, computer);
		System.out.println ("message:" + mesage);
	}
}