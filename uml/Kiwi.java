public class Kiwi implements Fruit{
	private String name;
	private int price = 0;
	public Kiwi(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public int getPrice(){
		return this.price;
	}
}