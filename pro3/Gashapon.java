import java.util.Random;
import java.util.ArrayList;
public class Gashapon {
	private Random random = new Random();
	private ArrayList<Capsule> arrayList = new ArrayList<Capsule>();
	public Gashapon () {
		this.arrayList.add(new Capsule(new Eraser("キン肉マン")));
		this.arrayList.add(new Capsule(new Eraser("ドラゴンボール")));
		this.arrayList.add(new Capsule(new KeyHolder("ハローキティ")));
		
	}
	public Capsule gasha() {
		
		int index = this.random.nextInt(this.arrayList.size());
		return this.arrayList.remove(index);
	}
}