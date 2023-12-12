import java.util.ArrayList;
public class B7_6 {
	public static void main (String[] args) {
		ArrayList<Educatee> arrayList = new ArrayList<Educatee>();
		arrayList.add(new Educatee("00ID00", "nakamura"));
		arrayList.add(new Educatee("00IE00", "iimura"));
		Educatee educatee1 = arrayList.get(0);
		Educatee educatee2 = arrayList.get(1);
		educatee1.setPassword("pass1");
		educatee1.setHeight(170);
		educatee2.setPassword("pass2");
		educatee2.setHeight(175);
		for (int i = 0; i < arrayList.size(); i++) {
			Educatee educatee = arrayList.get(i);
			System.out.print(educatee.getId() + " ");
			System.out.print(educatee.getName() + " ");
			System.out.print(educatee.getPassword() + " ");
			System.out.println(educatee.getHeight());
		}
	}
}