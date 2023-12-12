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
		System.out.print ("�� (����) ��0�A�� �i��j��1����͂��Ă��������F");
		this.playerHand = KeyboardReader.readInt();
	}
	public void judge() {
		System.out.println("�v���[���[�̓��́F" + this.playerHand);
		Dice dice0 = this.cup.get(0);
		Dice dice1 = this.cup.get(1);
		System.out.print(dice0.getValue() + " ");
		System.out.print(dice1.getValue() + " ");
		System.out.print("�ō��v��" + cup.getSum());
		System.out.println("�ł��B");
		int result = cup.getSum() % 2;
		System.out.println("���ʂ�" + result);
		if (result == this.playerHand) {
			System.out.println("�v���[���[�̏���");
		} else {
			System.out.println("�R���s���[�^�[�̏���");
		}
	}
}