public class D8_K1{
	public static void main(String[] args){
		HashChain hash = new HashChain(100);
		hash.put("チョコレート", new Snack2("チョコレート",200) );
		hash.put("クッキー", new Snack2("クッキー",100) );
		hash.put("キャンディー", new Snack2("キャンディー",300) );
		hash.put("ナッツ", new Snack2("ナッツ",120) );
		hash.put("ポテトフライ", new Snack2("ポテトフライ",180) );
		
		System.out.println("table");
		hash.printTable();
		
		System.out.println("search");
		String key = "ポテトフライ";
		Object data = hash.get(key);
		System.out.println(key + " " + data.toString());
	}
}