import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class D6_K1{
	public static void main(String[] args){
		List<Snack> list = new ArrayList<Snack>();
		list.add(new Snack("�L�����f�B�[", 300));
		list.add(new Snack("�N�b�L�[", 100));
		list.add(new Snack("�`���R���[�g", 200));
		list.add(new Snack("�r�X�P�b�g", 150));
		list.add(new Snack("�|�e�g�`�b�v�X", 250));
		list.add(new Snack("����ׂ�", 80));
		list.add(new Snack("�o�[���N�[�w��",160));
		
		print(list);
		System.out.println("sort");
		Comparator<Snack> c = new ComparatorSnackName();
		Collections.sort(list, c);
		print(list);
		System.out.println("search");
		String name = "�o�[���N�[�w��";
		Snack key = new Snack(name, 0);
		int index = Collections.binarySearch(list, key, c);
		Snack snack = list.get(index);
		print(snack);
	}
	public static void print(Snack snack){
		System.out.print(snack.getName() + " ");
		System.out.println(snack.getPrice());
	}
	public static void print(List<Snack> list){
		for(Snack snack : list){
			print(snack);
		}
	}
}