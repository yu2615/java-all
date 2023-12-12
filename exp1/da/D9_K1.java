public class D9_K1{
	public static void main(String[] args){
		HashOpenAddress hash = new HashOpenAddress(100);
		hash.put("Coffee", new Drink2("Coffee",500));
		hash.put("Tea", new Drink2("Tea",400));
		hash.put("Orenge", new Drink2("Orenge",310));
		hash.put("Strawberry", new Drink2("Strawberry",320));
		hash.put("Apple", new Drink2("Apple",330));
		hash.put("Peach", new Drink2("Peach",340));
		hash.put("Kiwi", new Drink2("Kiwi",350));
		hash.put("Milk", new Drink2("Milk",200));
		
		System.out.println("table");
		hash.printTable();
		
		System.out.println("search");
		String key = "Kiwi";
		Object data = hash.get(key);
		System.out.println(key + " " + data.toString());
	}
}