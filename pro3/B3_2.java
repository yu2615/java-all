public class B3_2 {
	public static void main (String[] args) {
		Dice dice = new Dice();
		dice.cast();
		int value = dice.getValue();
		System.out.println(value);
	}
}