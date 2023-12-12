public class Ex5_1{
	public static void main(String[] args){
		int i;
		double x,y;
		double h;
		double ds ,s;
		h = 0.01;
		x = 0.0;
		s = 0.0;
		for(i=0; i<(int)(1/h); i++){
			y = 3 * x * x;
			ds = y * h;
			s = s + ds;
			x = x + h;
		}
		System.out.println(s);
	}
}