public class D9_2{
	public static void main(String[] args){
		HashOpenAddress hash = new HashOpenAddress(100);
		hash.put("ぶどう", "400");
		hash.put("いちご", "500");
		hash.put("りんご", "300");
		hash.put("みかん", "200");
		
		System.out.println("table");
		hash.printTable();
		
		System.out.println("search");
		String key1 = "いちご";
		Object data1 = hash.get(key1);
		System.out.println(key1 + " " + data1.toString());
		
		System.out.println("remove");
		String key2 = "いちご";
		Object data2 = hash.remove(key2);
		System.out.println(key2 + " " + data2.toString());
		
		System.out.println("table");
		hash.printTable();
		
		System.out.println("search");
		String key3 = "みかん";
		Object data3 = hash.get(key3);
		System.out.println(key3 + " " + data3.toString());
	}
}