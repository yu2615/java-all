public class MedalGame {
	public static void main (String[] args) {
		int number = Medal.getNumber ();
		System.out.println ("���_���̔ԍ��F" + number);
		String name = Medal.getName (number);
		int score = Medal.getScore (number);
		System.out.println (name + "���_���F" + score + "�_");
	}
}