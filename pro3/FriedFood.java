public class FriedFood implements SideDish{
	private String food;
	private int price;
	public FriedFood(String food, int price) {
		this.food = food;
		this.price = price;
	}
	public String getFood() {
		return this.food;
	}
	public int getPrice() {
		return this.price;
	}
	public String getName() {
		String name = "�t���C";
		return this.food + name;
	}
	public void print() {
		System.out.println(getName() + getPrice() + "�~");
	}
}