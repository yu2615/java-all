import jp.tdu.util.KeyboardReader;
public class DiceGame {
	private Cup cup = new Cup();
	private int playerHand;
	public DiceGame(Dice dice0, Dice dice1) {
		this.cup.add(dice0);
		this.cup.add(dice1);
	}
	public void play() {
		this.cup.cast();
	}
	public void bet() {
		System.out.print ("丁 (偶数) は0、半 （奇数）は1を入力してください：");
		this.playerHand = KeyboardReader.readInt();
	}
	public void judge() {
		System.out.println("プレーヤーの入力：" + this.playerHand);
		Dice dice0 = this.cup.get(0);
		Dice dice1 = this.cup.get(1);
		System.out.print(dice0.getValue() + " ");
		System.out.print(dice1.getValue() + " ");
		System.out.print("で合計が" + cup.getSum());
		System.out.println("です。");
		int result = cup.getSum() % 2;
		System.out.println("結果は" + result);
		if (result == this.playerHand) {
			System.out.println("プレーヤーの勝ち");
		} else {
			System.out.println("コンピューターの勝ち");
		}
	}
}