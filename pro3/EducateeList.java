import java.util.ArrayList;
public class EducateeList {
	private ArrayList<Educatee> arrayList = new ArrayList<Educatee>();
	public EducateeList() {
	}
	public void add (Educatee educatee) {
		this.arrayList.add(educatee);
	}
 	public Educatee get(int number) {
		return this.arrayList.get(number);
	}
	public int getAverageHeight() {
		int sum = 0;
		for (int i = 0; i < arrayList.size(); i++) {
			Educatee educatee = this.arrayList.get(i);
			sum = sum + educatee.getHeight();
		}
		return sum / this.arrayList.size();
	}
	public int size() {
		return this.arrayList.size();
	}
}