public class PlasticTrayMain {
	public static void main (String[] args) {
		PlasticTray plasticTray = new PlasticTray();
		//PlasticTray.put( new Strawberry("あまおう", 50) );
		//PlasticTray.put( new Strawberry("とちおとめ", 40) );
		
		int size = plasticTray.getSize();
		System.out.println("いちごの個数" + size);
		for (int i = 0; i < size; i++) {
			Strawberry strawberry = plasticTray.getStrawberry(i);
			String name = strawberry.getName();
			int weight = strawberry.getWeight();
			System.out.println(name + " " +weight);
		}
		int totalWeight = plasticTray.getTotalWeight();
		System.out.println("合計" + totalWeight);
		int averageWeight = plasticTray.getAverageWeight();
		System.out.println("平均" + averageWeight);
	}
}