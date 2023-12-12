import java.util.ArrayList;
import java.util.Random;
public class ConcreteBox implements Box {
	private Random random = new Random();
	private ArrayList<Ball> arrayList = new ArrayList<Ball>();
	public ConcreteBox() {
	}
	public void add (Ball ball) {
		this.arrayList.add(ball);
	}
	public Ball take() {
		int  index = this.random.nextInt(this.arrayList.size());
		return this.arrayList.remove(index);
	}
	public int size() {
		return this.arrayList.size();
	}
}