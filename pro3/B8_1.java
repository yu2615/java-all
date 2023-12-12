import java.util.ArrayList;
public class B8_1 {
	public static void main (String[] args) {
		ArrayList<ConcreteBall> arrayList = new ArrayList<ConcreteBall>();
		for (int i = 0; i < 75; i++) {
			arrayList.add(new ConcreteBall(i + 1));
		}
		for (int i = 0; i < arrayList.size(); i++) {
			ConcreteBall concreteBall = arrayList.get(i);
			System.out.println(concreteBall.getNumber());
		}
	}
}