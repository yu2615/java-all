public class U1_1{
	public static void main (String[] args){
		Student student1 = new Student("s001","taro");
		Student student2 = new Student("s002","Hanako");
		String id1 = student1.getId();
		String name1 = student1.getName();
		String id2 = student2.getId();
		String name2 = student2.getName();
		System.out.println(id1 + " " + name1);
		System.out.println(id2 + " " + name2);
	}
}