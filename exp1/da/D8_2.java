public class D8_2{
	public static void main(String[] args){
		HashChain hash = new HashChain(100);
		hash.put("�Ԃǂ�", "400");
		hash.put("������", "500");
		hash.put("���", "300");
		hash.put("�݂���", "200");
		
		System.out.println("table");
		hash.printTable();
		
		System.out.println("search");
		//String key = "������";
		String key = "�݂���";
		Object data = hash.get(key);
		System.out.println(key + " " + data.toString());
	}
}