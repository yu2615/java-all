public class B4_1 {
	public static void main (String[] args) {
		Cup cup = new Cup();
		cup.add(new Dice());
		cup.add(new Dice());
		cup.cast();
		int sum = cup.getSum();
		System.out.print("サイコロの目の合計：" + sum);
		Dice dice1 = cup.get(0);
		System.out.print( "一つ目のサイコロの目：" + dice1.getValue() );
		Dice dice2 = cup.get(1);
		System.out.print( "二つ目のサイコロの目：" + dice2.getValue());
	}
}