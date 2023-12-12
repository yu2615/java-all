import java.util.Arrays;

public class Test2{
	public static void main(String[] args){
		String[] strings ={"Note","Book","Apple"};
		Arrays.sort(strings);
		for(String s : strings){
			System.out.print(s + " ");
		}
	}
}