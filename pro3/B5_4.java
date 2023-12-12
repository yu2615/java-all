public class B5_4 {
	public static void main (String[] args) {
		Cup cup = new Cup();
		//cup.add(new Dice());
		cup.add(new EvenDice());
		cup.add(new OddDice());
		cup.cast();
		int sum = cup.getSum();
		
		System.out.println(sum);
	}
}