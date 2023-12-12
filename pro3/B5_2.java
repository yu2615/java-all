public class B5_2 {
	public static void main (String[] args) {
		DiceGame diceGame = new DiceGame(new Dice(), new Dice());
		diceGame.play();
		diceGame.bet();
		diceGame.judge();
	}
}