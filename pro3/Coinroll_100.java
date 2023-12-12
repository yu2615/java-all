import java.util.ArrayList;
public class Coinroll_100 implements Value {
	private ArrayList<Coin100> arrayList = new ArrayList<Coin100>();
	public Coinroll_100() {
		for (int i = 0; i < 50; i++) {
			this.arrayList.add(new Coin100());
			
		}
	}
	public int getValue() {
		int sum = 0;
		for (int i = 0; i < this.arrayList.size(); i++) {
			Value value = this.arrayList.get(i);
			sum = sum + value.getValue();
		}
		return sum;
	}
}