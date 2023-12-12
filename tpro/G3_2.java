import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class G3_2{
	public static void main(String[] args){
		List<Undergraduate>list1 = Arrays.asList(GData.DATA1);
		Comparator<Undergraduate> comparator = new UComparator();
		Collections.sort(list1, comparator);
		for(Undergraduate u: list1){
			System.out.println(u.getId() + " " + u.getGpa());
		}
	}
}