import jp.tdu.util.RandomNumber;
public class Kuji {
	public static int getNumber () {
		int a = RandomNumber.nextInt(4);
		return a;
	}
	public static String getPrize (int number) {
		String[] Prize = {"�X�g���b�v", "������", "�ʂ������", "�t�B�M���A"};
		return Prize[number];
	}
}