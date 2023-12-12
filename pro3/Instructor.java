public class Instructor {
	private String id;
	private String name;
	private int salary = 100000;
	public Instructor (String id) {
		this.id = id;
		this.name = name;
	}
	public String getName () {
		return this.name;
	}
	public String getId () {
		return this.id;
	}
	public int getSalary () {
		return this.salary;
	}
	public void setName (String name) {
		this.name = name;
	}
	public void setSalary (int salary) {
		this.salary = salary;
	}
}