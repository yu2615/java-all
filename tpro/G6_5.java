import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class G6_5{
	public static void main(String[] args){
		List<Undergraduate>list1 = Arrays.asList(GData.DATA1);
		
		Comparator<Undergraduate> comparator
		= (o1,o2)-> o2.getGpa().compareTo(o1.getGpa());
		
		/*Comparator<Undergraduate>comparator 
		= Comparator.comparing((o) -> o.getGpa(), (v1, v2) -> v2.compareTo(v1));*/
		
		/*Comparator<Undergraduate>comparator 
		= Comparator.comparing(Undergraduate::getGpa).reversed();*/
		
		Collections.sort(list1, comparator);
		for(Undergraduate u: list1){
			System.out.println(u.getId()+ " " + u.getGpa());
		}
	}
}