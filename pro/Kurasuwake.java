import jp.tdu.util.KeyboardReader;
public class Kurasuwake {
	public static void main (String[] args) {
		System.out.print ("�w�Дԍ�����͂��Ă��������F");
		String id = KeyboardReader.readString();
		int number = Integer.parseInt (id.substring(4));
		System.out.println (getMessage (number % 3) + "�ł�");
	}
	public static String getMessage (int r) {
		String[] messages = {"C", "B", "A"};
		return "�l�b�g�N���X���[��" + messages[r];
	}
}