public class D8_K1{
	public static void main(String[] args){
		HashChain hash = new HashChain(100);
		hash.put("�`���R���[�g", new Snack2("�`���R���[�g",200) );
		hash.put("�N�b�L�[", new Snack2("�N�b�L�[",100) );
		hash.put("�L�����f�B�[", new Snack2("�L�����f�B�[",300) );
		hash.put("�i�b�c", new Snack2("�i�b�c",120) );
		hash.put("�|�e�g�t���C", new Snack2("�|�e�g�t���C",180) );
		
		System.out.println("table");
		hash.printTable();
		
		System.out.println("search");
		String key = "�|�e�g�t���C";
		Object data = hash.get(key);
		System.out.println(key + " " + data.toString());
	}
}