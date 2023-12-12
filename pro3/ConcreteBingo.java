import jp.tdu.util.KeyboardReader;
public class ConcreteBingo implements Bingo {
	private Box box = new ConcreteBox();
	public ConcreteBingo(){
		for (int i = 0; i < 75; i++) {
			this.box.add(new ConcreteBall(i + 1));
		}
	}
	public void play() {
		int size = box.size();
		for (int i = 0; i < size; i++) {
			KeyboardReader.readString();
			Ball ball = this.box.take();
			System.out.println((i + 1)+ "”Ô–Ú" + " " + "”Ô†F"+ ball.getNumber());
		}
	}
}