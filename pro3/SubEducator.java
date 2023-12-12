public class SubEducator extends Educator {
	public String password;
	public SubEducator (String id, String name) {
		super (id, name);
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return this.password;
	}
}