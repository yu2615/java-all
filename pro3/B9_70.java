public class B9_70 {
	public static void main(String[] args) {
		Toy toy1 = new Eraser("�L�����}��");
		Toy toy2 = new Eraser("�h���S���{�[��");
		System.out.print(toy1.getGoods() + " ");
		System.out.println(toy1.getCharacter());
		System.out.print(toy2.getGoods() + " ");
		System.out.println(toy2.getCharacter());
	}
}