import java.util.Random;
public class Dice implements Castable {
	private Random random = new Random();
	private int value = 1;
	public Dice() {
	}
	public void cast() {
		this.value = this.random.nextInt(6) + 1;
	}
	public int getValue () {
		return this.value;
	}
}