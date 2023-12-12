public class Post2{
	private int code;
	private String address;
	public Post2(int code, String address){
		this.code = code;
		this.address = address;
	}
	public void setCode(int code){
		this.code = code;
	}
	public int getCode(){
		return this.code;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return this.address;
	}
	@Override
	public String toString(){
		return this.code + " " + this.address;
	}
}