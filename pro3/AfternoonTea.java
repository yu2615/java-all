import java.util.ArrayList;
public class AfternoonTea {
	private Tea tea;
	private ArrayList<Cake> list = new ArrayList<Cake>();
	public AfternoonTea() {
	}
	public void setTea (Tea tea) {
		this.list.add(tea);
	}
	public void addCake (Cake cake) {
		this.list.add(cake);
	}
	public int getTotalPrice() {
		int sum = 0;
		for (int i = 0; i < this.list.size(); i++) {
			Tea a = this.list.get(i);
			Cake b = this.list.get(i);
			sum = sum + a.getPrice() + b.getPrice();
		return sum;
	}
	public void print() {
		for (int i = 0; i < this.list.size(); i++) {
			Tea c = this.list.get(i);
			Cake d = this.list.get(i);
			c.print();
			d.print();
	}
}