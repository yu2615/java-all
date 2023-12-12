public class CakeMain {
	public static void main (String[] args) {
		Cake cake1 = new HotCake("メープル", 600);
		Cake cake2 = new HotCake("フルーツ", 700);
		System.out.println (cake1.getTopping());
		System.out.println (cake1.getPrice());
		System.out.println (cake1.getName());
		cake1.print();
		cake2.print();
	}
}