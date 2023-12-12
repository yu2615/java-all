public class B6_5 {
	public static void main (String[] args) {
		CoinBox coinBox = new CoinBox();
		coinBox.add(new Coin100());
		coinBox.add(new Coin100());
		coinBox.add(new Coin50());
		coinBox.add(new Check(250));
		
		System.out.println("çáåv" +coinBox.getSum() + "Ç≈Ç∑ÅB");
		//System.out.println(coinBox.remove(100));
		//System.out.println(coinBox.remove(50));
		//System.out.println(coinBox.remove(250));
		//System.out.println(coinBox.remove(5));
		coinBox.print();
		
	}
}