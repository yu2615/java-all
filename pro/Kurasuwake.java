import jp.tdu.util.KeyboardReader;
public class Kurasuwake {
	public static void main (String[] args) {
		System.out.print ("学籍番号を入力してください：");
		String id = KeyboardReader.readString();
		int number = Integer.parseInt (id.substring(4));
		System.out.println (getMessage (number % 3) + "です");
	}
	public static String getMessage (int r) {
		String[] messages = {"C", "B", "A"};
		return "ネットクラスルーム" + messages[r];
	}
}