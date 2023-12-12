public class Student implements Comparable<Student>{
	private String id;
	private String name;
	private int height;
	public Student(String id, String name){
		this.id = id;
		this.name = name;
	}
	public String getId(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
	public void setHeight(int height){
		this.height = height;
	}
	public int getHeight(){
		return this.height;
	}
	@Override
	public int compareTo(Student student){
		if(student == null){
			throw new ClassCastException();
		}
		return this.getId().compareTo(student.getId());
	}
	@Override
	public int hashCode(){
		if(this.getId() == null){
			return 0;
		}
		return this.getId().hashCode();
	}
	@Override
	public boolean equals(Object o){
		if(o instanceof Student){
			Student student = (Student)o;
			return this.getId().equals(student.getId());
		}
		return false;
	}
}