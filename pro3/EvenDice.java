import java.util.Random;
public class EvenDice implements Castable{
	private Random random = new Random();
	private int value = 2;
	public EvenDice() {
	}
	public void cast() {
		this.value = (this.random.nextInt(3) + 1) * 2;
	}
	public int getValue() {
		return this.value;
	}
}