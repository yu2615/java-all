import jp.tdu.util.KeyboardReader;
public class A8_3 {
	public static void main (String[] args) {
		System.out.print ("���R������͂��Ă�������: ");
		int a = KeyboardReader.readInt();
		if (a < 0) {
			System.out.println ("���R���ł͂���܂���");
		} else {
			System.out.println (calculate(a));
		}
	}
	public static int calculate (int number) {
		int sum = 0;
		for (int i = 0; i < number; i++) {
			sum = sum + (i + 1);
		}
		return sum;
	}
}