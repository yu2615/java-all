public class Teacher {
	private String id;
	private String name;
	private int salary = 100000;
	public Teacher (String id,String name) {
		this.id = id;
		this.name = name;
	}
	public String getId () {
		return this.id;
	}
	public String getName () {
		return this.name;
	}
	public int getSalary () {
		return this.salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}