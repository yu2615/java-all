public class Decoration {
	public static void main (String[] args) {
		paint (decorate ("***", "���͂悤"), 3);
		paint (decorate ("+++", "����΂��"), 2);
	}
	public static void paint (String str, int number) {
		for (int i = 0; i < number; i++) {
			System.out.println (str);
		}
	}
	public static String decorate (String deco, String message) {
		return (deco + message + deco);
	}
}