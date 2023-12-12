public class StrawberryMain {
	public static void main (String[] args) {
		Strawberry strawberry1 = new Strawberry("‚ ‚Ü‚¨‚¤", 50);
		Strawberry strawberry2 = new Strawberry("‚Æ‚¿‚¨‚Æ‚ß", 40);
		
		String name1 = strawberry1.getName();
		String name2 = strawberry2.getName();
		int weight1 = strawberry1.getWeight();
		int weight2 = strawberry2.getWeight();
		System.out.println(name1 + " " + weight1);
		System.out.println(name2 + " " + weight2);
	}
}