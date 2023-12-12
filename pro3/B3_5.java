import java.util.ArrayList;
public class B3_5 {
	public static void main (String[] args) {
		ArrayList<Dice> diceBox = new ArrayList<Dice>();
		for (int i = 0; i < 5; i++) {
			diceBox.add(new Dice());
		}
		for (int i = 0; i < diceBox.size(); i++) {
			Dice dice = diceBox.get(i);
			dice.cast();
		}
		for (int i = 0; i < diceBox.size(); i++) {
			Dice dice = diceBox.get(i);
			System.out.println(dice.getValue());
		}
		int sum = 0;
		for (int i = 0; i < diceBox.size(); i++) {
			Dice dice = diceBox.get(i);
			sum = sum + dice.getValue();
		}
		System.out.println (sum);
	}
}