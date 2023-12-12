public class CashbookManager{
	private Cashbook cashbook;
	public CashbookManager(Cashbook cashbook){
		this.cashbook = cashbook;
	}
	public String getName(){
		return this.cashbook.getName();
	}
	public int size(){
		return this.cashbook.size();
	}
	public int getRemainder1(int size){
		int sum = 0;
		for(int i = 0; i < size; i++){
			Item item = this.cashbook.get(i);
			int remainder = item.getRemainder();
			sum = sum + remainder;
		}
		return sum;
	}
	public int getRemainder2(){
		return this.getRemainder1(this.size());
	}
	public void print(){
		int size = this.cashbook.size();
		for(int i = 0; i < size; i++){
			Item item = this.cashbook.get(i);
			String date = item.getDate();
			String name = item.getName();
			String kind = item.getKind();
			int amount = item.getAmount();
			int remainder = getRemainder1(i + 1);
			System.out.println(date + " " + name + " " + kind + " " 
					 + amount + " " + remainder);
		} 
	}
	public Cashbook searchItemName(String name){
		Cashbook cashbook2 = new Cashbook();
		int size = this.cashbook.size();
		for(int i = 0; i < size; i++){
			Item item = this.cashbook.get(i);
			String name2 = item.getName();
			if(name.equals( name2 )){
				cashbook2.add(item);
			}
		}
		return cashbook2;
	}
	public void print2(){
		int size = this.cashbook.size();
		for(int i = 0; i < size; i++){
			Item item = this.cashbook.get(i);
			String date = item.getDate();
			String name = item.getName();
			String kind = item.getKind();
			int amount = item.getAmount();
			System.out.println(date + " " + name + " " + kind  + " " +
				amount);
		}
	}
	public int getSum(){
		int sum = 0;
		int size = this.cashbook.size();
		for(int i = 0; i < size; i++){
			Item item = this.cashbook.get(i);
			sum = sum + item.getAmount();
		}
		return sum;
	}
}