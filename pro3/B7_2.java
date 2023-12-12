public class B7_2 {
	public static void main (String[] args) {
		Educatee educatee1 = new Educatee("19AJ088", "takahashi");
		Educatee educatee2 = educatee1;
		educatee1.setPassword ("11");
		System.out.println(educatee1.getPassword());
		System.out.println(educatee2.getPassword());
	}
}