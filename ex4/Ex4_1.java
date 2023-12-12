import java.util.Scanner;

public class Ex4_1{
	public static void main(String[] args){
		System.out.print("実数値を入力してください：");
		Scanner scan = new Scanner(System.in);//キーボード入力の準備
		double num = scan.nextDouble();//キーボードから実数値を入力
		System.out.println("入力した実数値は" + num + "です。");
	}
}