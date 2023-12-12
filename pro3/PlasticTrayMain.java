public class PlasticTrayMain {
	public static void main (String[] args) {
		PlasticTray plasticTray = new PlasticTray();
		//PlasticTray.put( new Strawberry("‚ ‚Ü‚¨‚¤", 50) );
		//PlasticTray.put( new Strawberry("‚Æ‚¿‚¨‚Æ‚ß", 40) );
		
		int size = plasticTray.getSize();
		System.out.println("‚¢‚¿‚²‚ÌŒÂ”" + size);
		for (int i = 0; i < size; i++) {
			Strawberry strawberry = plasticTray.getStrawberry(i);
			String name = strawberry.getName();
			int weight = strawberry.getWeight();
			System.out.println(name + " " +weight);
		}
		int totalWeight = plasticTray.getTotalWeight();
		System.out.println("‡Œv" + totalWeight);
		int averageWeight = plasticTray.getAverageWeight();
		System.out.println("•½‹Ï" + averageWeight);
	}
}