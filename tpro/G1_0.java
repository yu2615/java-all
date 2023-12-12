public class G1_0{
	public static void main(String[] args){
		int a1 = 2;
		int b1 = 2;
		int c1 = a1 + b1;
		System.out.println(c1);
		Integer a2 = new Integer(2);
		Integer b2 = new Integer(2);
		Integer c2 = a2 + b2;
		System.out.println(c2);
		
		System.out.println(a2.equals(b2));
	}
}