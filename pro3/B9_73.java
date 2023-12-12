public class B9_73 {
	public static void main (String[] args) {
		Gashapon gashapon = new Gashapon();
		Capsule capsule = gashapon.gasha();
		Toy toy = capsule.open();
		System.out.print("カプセルの中身は");
		System.out.print(toy.getCharacter());
		System.out.println(toy.getGoods() + "です");
	}
}