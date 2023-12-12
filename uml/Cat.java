public class Cat implements Pet{
	private String name;
	public Cat(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public String say(String s){
		return "Ç…Ç·Å[";
	}
}