import java.util.Random;
public class OddDice implements Castable{
	private Random random = new Random();
	private int value = 1;
	public OddDice() {
	}
	public void cast() {
		this.value = this.random.nextInt(3) * 2 + 1;
	}
	public int getValue() {
		return this.value;
	}
}