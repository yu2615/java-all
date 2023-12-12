public class RucksackMain {
	public static void main (String[] args) {
		Rucksack rucksack = new Rucksack();
		rucksack.add(new Gum(100));
		rucksack.add(new Gum(150));
		
		rucksack.printItems();
		int sum = rucksack.getSum();
		System.out.println("----");
		System.out.println("çáåv" + sum + "â~");
	}
}