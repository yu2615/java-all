public class B9_72 {
	public static void main (String[] args) {
		Toy toy1 = new KeyHolder("ハローキティ");
		Capsule capsule = new Capsule(toy1);
		 
		Toy toy2 = capsule.open();
		
		System.out.print("カプセルの中身は");
		System.out.print(toy2.getCharacter());
		System.out.println(toy2.getGoods() + "です");
	}
}