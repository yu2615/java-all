import java.util.Scanner;

public class keyboard{
	public static String inputString(String message){
		Scanner scanner = new Scanner(System.in);
		System.out.print(message);
		return scanner.nextLine();
	}
	public static int inputInt(String message){
		Scanner scanner = new Scanner(System.in);
		System.out.print(message);
		return scanner.nextInt();
	}
}