public class Tea {
	private String name;
	private int price;
	public Tea (String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public void print() {
		System.out.println(getName() + getPrice() + "�~");
	}
}