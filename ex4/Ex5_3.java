import java.util.Scanner;

public class Ex5_3{
	public static void main(String[] args){
		double t;//����
		double x;//���x
		double v;//���x
		double h;//���ݕ�
		double g;//�d�͉����x
		
		h = 0.01;
		g = 9.80665;
		t = 0;
		x = 0;
		v = 0;
		
		System.out.print("�����x����͂��Ă��������F");
		Scanner scan1 = new Scanner(System.in);
		double v0 = scan1.nextDouble();
		System.out.print("�������x����͂��Ă�������");
		Scanner scan2 = new Scanner(System.in);
		double  x0 = scan2.nextDouble();
		
		x = x0;
		
		while(x > 0){
			t = t + h;
			v = v0 + g*t;
			x = x0 -v*h;
			
			System.out.println("����:"+ String.format("%.g3",t));
			System.out.println("���x:"+ String.format("%.3f",x));
			System.out.println("���x�F" + String.format("%.3f",v));
			x0 = x;
			v0 = v;
		}
	}
}