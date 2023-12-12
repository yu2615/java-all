public class Snack2{
	private String name;
	private int price;
	public Snack2(String name, int price){
		this.name = name;
		this.price = price;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getPrice(){
		return this.price;
	}
	public void setPrice(int price){
		this.price = price;
	}
	@Override
	public String toString(){
		return this.name + " " + this.price;
	}
}