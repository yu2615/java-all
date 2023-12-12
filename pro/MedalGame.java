public class MedalGame {
	public static void main (String[] args) {
		int number = Medal.getNumber ();
		System.out.println ("メダルの番号：" + number);
		String name = Medal.getName (number);
		int score = Medal.getScore (number);
		System.out.println (name + "メダル：" + score + "点");
	}
}