import java.util.ArrayList;
public class B6_2 {
	public static void main (String[] args) {
		ArrayList<Value>arrayList = new ArrayList<Value>();
		arrayList.add(new Coin100());
		arrayList.add(new Coin100());
		arrayList.add(new Coin50());
		int sum = 0;
		for (int i = 0; i < arrayList.size(); i++) {
			Value value = arrayList.get(i);
			sum = sum + value.getValue();
		}
		System.out.print("‡Œv");
		System.out.println(sum + "‚Å‚·");
	}
}