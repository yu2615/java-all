import java.util.ArrayList;
public class Cup {
	private ArrayList<Castable> arrayList = new ArrayList<Castable>();
	public Cup() {
	}
	public void add(Castable dice) {
		this.arrayList.add(dice);
	}
	public Castable get(int number) {
		return this.arrayList.get(number);
	}
	public int size() {
		return this.arrayList.size();
	}
	public void cast() {
		for (int i = 0; i < this.arrayList.size(); i++) {
			Castable dice = this.arrayList.get(i);
			dice.cast();
		}
	}
	public int getSum() {
		int sum = 0;
		for (int i = 0; i < this.arrayList.size(); i++) {
			Castable dice = this.arrayList.get(i);
			sum = sum + dice.getValue(); 
		}
		return sum;
	}
	public int getValue(int number) {
		Castable dice = this.arrayList.get(number);
		return dice.getValue();
	}
}