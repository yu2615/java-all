public class TeaMain {
	public static void main (String[] args) {
		Tea tea1 = new Tea("�A�[���O���[", 400);
		Tea tea2 = new Tea("�^�s�I�J�~���N�e�B�[", 500);
		System.out.println (tea1.getName());
		System.out.println (tea1.getPrice());
		tea1.print();
		tea2.print();
	}
}