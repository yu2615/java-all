public class GumMain {
	public static void main (String[] args) {
		Gum gum1 = new Gum(100);
		Gum gum2 = new Gum(150);
		
		String item1 = gum1.getItem();
		String item2 = gum2.getItem();
		int price1 = gum1.getPrice();
		int price2 = gum2.getPrice();
		int sum = price1 + price2;
		System.out.println(item1 + " " + price1+ "�~");
		System.out.println(item2 + " " + price2+ "�~");
		System.out.println("���v" + sum + "�~");
	}
}