import java.util.Random;
import java.util.ArrayList;
public class Gashapon {
	private Random random = new Random();
	private ArrayList<Capsule> arrayList = new ArrayList<Capsule>();
	public Gashapon () {
		this.arrayList.add(new Capsule(new Eraser("�L�����}��")));
		this.arrayList.add(new Capsule(new Eraser("�h���S���{�[��")));
		this.arrayList.add(new Capsule(new KeyHolder("�n���[�L�e�B")));
		
	}
	public Capsule gasha() {
		
		int index = this.random.nextInt(this.arrayList.size());
		return this.arrayList.remove(index);
	}
}