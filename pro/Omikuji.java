import jp.tdu.util.RandomNumber;
public class Omikuji {
	public static String getWelcomeMessage (String name) {
		String c = "";
		c = name + "����̍����̉^����";
		return c;
	}
	public static String getMessage (int number) {
		String[] message = {"��g", "���g", "���g", "�g", "���g", "��", "�勥"} ;
		return message[number];
	}
	public static String getRandomMessage () {
		int a = RandomNumber.nextInt(7);
		return getMessage(a) + "�ł�";
	}
	public static void consult (String name) {
		System.out.print (getWelcomeMessage(name));
		System.out.println (getRandomMessage()); 
	}
}