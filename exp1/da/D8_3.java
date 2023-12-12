public class D8_3{
	public static void main(String[] args){
		HashChain hash = new HashChain(100);
		hash.put("Tokyo", new Post(120, "Tokyo"));
		hash.put("Chiba", new Post(270, "Chiba"));
		hash.put("Saitama", new Post(350, "Saitama"));
		hash.put("Yamanashi", new Post(400, "Yamanashi"));
		hash.put("Kyoto", new Post(600, "Kyoto"));
		hash.put("Okayama", new Post(700, "Okayama"));
		
		System.out.println("table");
		hash.printTable();
		
		System.out.println("search");
		String key = "Kyoto";
		Object data = hash.get(key);
		System.out.println(key + " " + data.toString());
	}
}