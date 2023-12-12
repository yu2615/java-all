import java.util.Scanner;
import java.util.InputMismatchException;
public class B11_3 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		int i = 0;
		try {
			i = scanner.nextInt();
		}catch (InputMismatchException e) {
			i = Integer.MAX_VALUE;
		}
		System.out.println(i);
	}
}