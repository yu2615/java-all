public class HotCake implements Cake{
	private String topping;
	private int price;
	public HotCake (String topping, int price) {
		this.topping = topping;
		this.price = price;
	}
	public String getTopping() {
		return this.topping;
	}
	public int getPrice() {
		return this.price;
	}
	public String getName() {
		String name = "ホットケーキ";
		return this.topping + name;
	}
	public void print() {
		System.out.println(getName() + getPrice() + "円");
	}
}