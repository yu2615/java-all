public class B7_4 {
	public static void main (String[] args){
		Educatee educatee1 = new Educatee("00ID00", "nakamura");
		Educatee educatee2 = new Educatee("00IE00","iimura");
		educatee1.setHeight(170);
		educatee2.setHeight(175);
		System.out.println(educatee1.getHeight());
		System.out.println(educatee2.getHeight());
	}
}