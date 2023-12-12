import java.util.ArrayList;
public class PlasticTray {
	private ArrayList<Strawberry> arrayList = new ArrayList<Strawberry> ();
	public PlasticTray() {
	}
	public void put(Strawberry strawberry) {
		this.arrayList.add(strawberry);
	}
	public Strawberry getStrawberry(int index) {
		return this.arrayList.get(index);
	}
	public int getSize() {
		return this.arrayList.size();
	}
	public int getTotalWeight() {
		int sum = 0;
		for (int i = 0; i < this.arrayList.size(); i++) {
			Strawberry strawberry = this.arrayList.get(i);
			sum = sum + strawberry.getWeight();
		}
		return sum;
	}
	public int getAverageWeight() {
		return this.getTotalWeight() / this.getSize();
	}
}