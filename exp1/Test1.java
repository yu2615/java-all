import java.util.Arrays;

public class Test1{
	public static void main(String[] args){
		int[] numbers = {2,5,3,1,4};
		Arrays.sort(numbers);
		for(int i: numbers){
			System.out.print(i + " ");
		}
	}
}