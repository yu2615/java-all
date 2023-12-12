public class Educatee {
	private String id;
	private String name;
	private String password = " ";
	private int height = 0;
	public Educatee (String id , String name) {
		this.id = id;
		this.name= name;
	}
	public String getId() {
		return this.id;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return this.password;
	}
	public String getName() {
		return this.name;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getHeight() {
		return this.height;
	}
}