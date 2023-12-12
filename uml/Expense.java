public class Expense implements Item{
	private String date;
	private String name;
	private String kind;
	private int amount;
	public Expense(String date,String name, String kind, int amount){
		this.date = date;
		this.name = name;
		this.kind = kind;
		this.amount = amount;
		
	}
	public String getDate(){
		return this.date;
	}
	public String getName(){
		return this.name;
	}
	public String getKind(){
		return this.kind;
	}
	public int getAmount(){
		return this.amount;
	}
	public int getRemainder(){
		return - this.amount;
	}
}