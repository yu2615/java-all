public class D8_2{
	public static void main(String[] args){
		HashChain hash = new HashChain(100);
		hash.put("ぶどう", "400");
		hash.put("いちご", "500");
		hash.put("りんご", "300");
		hash.put("みかん", "200");
		
		System.out.println("table");
		hash.printTable();
		
		System.out.println("search");
		//String key = "いちご";
		String key = "みかん";
		Object data = hash.get(key);
		System.out.println(key + " " + data.toString());
	}
}