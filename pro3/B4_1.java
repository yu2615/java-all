public class B4_1 {
	public static void main (String[] args) {
		Cup cup = new Cup();
		cup.add(new Dice());
		cup.add(new Dice());
		cup.cast();
		int sum = cup.getSum();
		System.out.print("�T�C�R���̖ڂ̍��v�F" + sum);
		Dice dice1 = cup.get(0);
		System.out.print( "��ڂ̃T�C�R���̖ځF" + dice1.getValue() );
		Dice dice2 = cup.get(1);
		System.out.print( "��ڂ̃T�C�R���̖ځF" + dice2.getValue());
	}
}