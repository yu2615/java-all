public class WadMain {
	public static void main (String[] args) {
		CoinBox coinBox = new CoinBox();
		coinBox.add( new Wad_10000());
		
		coinBox.print();
		int sum = coinBox.getSum();
		System.out.println("----");
		System.out.println("çáåv" + sum + "â~");
	}
}