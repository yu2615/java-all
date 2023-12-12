public class B7_9 {
	public static void main (String[] args) {
		EducateeList educateeList = new EducateeList();
		educateeList.add(new Educatee("00ID00", "nakamura"));
		educateeList.add(new Educatee("00IE00", "iimura"));
		Educatee educatee1 = educateeList.get(0);
		Educatee educatee2 = educateeList.get(1);
		educatee1.setHeight(170);
		educatee2.setHeight(175);
		System.out.print("ïΩãœêgí∑:");
		System.out.println (educateeList.getAverageHeight());
	}
}