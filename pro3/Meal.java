import java.util.ArrayList;
public class Meal {
	private ArrayList<SideDish> list = new ArrayList<SideDish>();
	public Meal() {
	}
	public void addSideDish(SideDish sideDish) {
		this.list.add(sideDish);
	}
	public int getTotalPrice() {
		int sum = 0;
		for (int i = 0; i < this.list.size(); i++) {
			SideDish a = this.list.get(i);
			sum = sum + a.getPrice();
		}
		return sum;
	}
	public void print() {
		for (int i = 0; i < this.list.size(); i++) {
			SideDish b = this.list.get(i);
			//System.out.println(b.getName() + b.getPrice() + "‰~");
			b.print();
		}
	}
}