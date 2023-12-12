public class B5_3 {
	public static void main (String[] args) {
		Cup cup = new Cup();
		cup.add(new Dice());
		cup.add(new Dice());
		
		
		cup.cast();
		int sum = cup.getSum();
		System.out.println("サイコロの目の合計：" + sum);
	}
}