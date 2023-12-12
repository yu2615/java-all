import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class G4_3{
	public static void main(String[] args){
		//Iterable
		List<String> l = Arrays.asList("123","456");
		
		Consumer<String>function1 = new Consumer<String>(){
			@Override
			public void accept(String s){
				System.out.println(s);
			}
		};
		
		for(String s: l){//外部イテレータ
			function1.accept(s);
		}
		
		Consumer<String>function2 = (v) -> System.out.println(v);
		for(String s: l){
			function2.accept(s);
		}
		
		l.forEach((v) -> System.out.println(v));
		//ラムダ式はmetho名を隠蔽する、内部イテレータ
	}
}