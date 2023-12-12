import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class G6_1{
	public static void main(String[] args){
		List<Undergraduate>list1 = Arrays.asList(GData.DATA1);
		Function<Undergraduate, String> keyExtractor = (Undergraduate u) -> u.getId();
		
		list1.forEach((u) ->{
			System.out.println(keyExtractor.apply(u));
		});
	}
}