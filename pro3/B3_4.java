public class B3_4 {
	public static void main (String[] args) {
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		dice1.cast();
		dice2.cast();
		System.out.println (dice1.getValue());
		System.out.println (dice2.getValue());
		int sum = dice1.getValue() + dice2.getValue();
		System.out.println (sum);
	}
}