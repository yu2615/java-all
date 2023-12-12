import jp.tdu.util.RandomNumber;
public class Medal {
	public static int getNumber () {
		int number = RandomNumber.nextInt(3);
		return number +1;
	}
	public static String getName (int number) {
		String[] name = {"“º", "‹â", "‹à"};
		return name[number - 1];
	}
	public static int getScore (int number) {
		int score = number * 5;
		return score;
	}
}