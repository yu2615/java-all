public class D3_K1{
	public static void main(String[] args){
		SnackList snackList = new SnackList();
		snackList.add(new Snack("�`���R���[�g",200));
		snackList.add(new Snack("�N�b�L�[",100));
		snackList.add(new Snack("�L�����f�B�[",300));
		
		String key = "�L�����f�B�[";
		Snack snack = search(snackList, key);
		print(snack);
	}
	public static Snack search(SnackList snackList,String key){
		int size = snackList.size();
		for(int i = 0; i < size; i++){
			Snack snack = snackList.get(i);
			String name = snack.getName();
			if(name.equals(key)){
				return snack;
			}
		}
		return null;
	}
	public static void print(Snack snack){
		System.out.print(snack.getName()+ " ");
		System.out.println(snack.getPrice());
	}
}