import jp.tdu.util.RandomNumber;
public class A10_3 {
	public static void main (String[] args) {
		int computer = RandomNumber.nextInt (3);
		String computerHand = Janken.getHandSign (computer);
		System.out.println ("ŒvZ‹@‚ÌèF" + computerHand);
	}
}