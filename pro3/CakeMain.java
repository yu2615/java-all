public class CakeMain {
	public static void main (String[] args) {
		Cake cake1 = new HotCake("���[�v��", 600);
		Cake cake2 = new HotCake("�t���[�c", 700);
		System.out.println (cake1.getTopping());
		System.out.println (cake1.getPrice());
		System.out.println (cake1.getName());
		cake1.print();
		cake2.print();
	}
}