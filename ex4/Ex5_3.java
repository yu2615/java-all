import java.util.Scanner;

public class Ex5_3{
	public static void main(String[] args){
		double t;//時刻
		double x;//高度
		double v;//速度
		double h;//刻み幅
		double g;//重力加速度
		
		h = 0.01;
		g = 9.80665;
		t = 0;
		x = 0;
		v = 0;
		
		System.out.print("初速度を入力してください：");
		Scanner scan1 = new Scanner(System.in);
		double v0 = scan1.nextDouble();
		System.out.print("初期高度を入力してください");
		Scanner scan2 = new Scanner(System.in);
		double  x0 = scan2.nextDouble();
		
		x = x0;
		
		while(x > 0){
			t = t + h;
			v = v0 + g*t;
			x = x0 -v*h;
			
			System.out.println("時刻:"+ String.format("%.g3",t));
			System.out.println("高度:"+ String.format("%.3f",x));
			System.out.println("速度：" + String.format("%.3f",v));
			x0 = x;
			v0 = v;
		}
	}
}