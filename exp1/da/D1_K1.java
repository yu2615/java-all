public class D1_K1{
	public static void main(String[] args){
		Snack snack1 = new Snack("�`���R���[�g",200);
		Snack snack2 = new Snack("�N�b�L�[",100);
		Snack snack3 = new Snack("�L�����f�B�[",300);
		snack1.setPrice(200);
		snack2.setPrice(100);
		snack3.setPrice(300);
		String name1 = snack1.getName();
		int price1 = snack1.getPrice();
		String name2 = snack2.getName();
		int price2 = snack2.getPrice();
		String name3 = snack3.getName();
		int price3 = snack3.getPrice();
		System.out.println(name1 + " " + price1);
		System.out.println(name2 + " " + price2);
		System.out.println(name3 + " " + price3);
	}
}