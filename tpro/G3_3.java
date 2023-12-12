import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class G3_3{
	public static void main(String[] args){
		List<Undergraduate>list1 = Arrays.asList(GData.DATA1);
		Comparator<Undergraduate> comparator = new Comparator<Undergraduate>(){
			@Override
			public int compare(Undergraduate o1, Undergraduate o2){
				if(!o2.getGpa().equals(o1.getGpa())){
					return o2.getGpa().compareTo(o1.getGpa());
				}
				return o1.getId().compareTo(o2.getId());
			}
		};
		Collections.sort(list1, comparator);
		for(Undergraduate u: list1){
			System.out.println(u.getId() + " " + u.getGpa());
		}
	}
}