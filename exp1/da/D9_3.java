public class D9_3{
	public static void main(String[] args){
		HashOpenAddress hash = new HashOpenAddress(100);
		hash.put("Tokyo", new Post2(120, "Tokyo"));
		hash.put("Chiba", new Post2(270, "Chiba"));
		hash.put("Saitama", new Post2(350, "Saitama"));
		hash.put("Yamanashi", new Post2(400, "Yamanashi"));
		hash.put("Kyoto", new Post2(600, "Kyoto"));
		hash.put("Okayama", new Post2(700, "Okayama"));
		
		System.out.println("table");
		hash.printTable();
		
		System.out.println("search");
		String key = "Kyoto";
		Object data = hash.get(key);
		System.out.println(key + " " + data.toString());
	}
}