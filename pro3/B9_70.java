public class B9_70 {
	public static void main(String[] args) {
		Toy toy1 = new Eraser("キン肉マン");
		Toy toy2 = new Eraser("ドラゴンボール");
		System.out.print(toy1.getGoods() + " ");
		System.out.println(toy1.getCharacter());
		System.out.print(toy2.getGoods() + " ");
		System.out.println(toy2.getCharacter());
	}
}