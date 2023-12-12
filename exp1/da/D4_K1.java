public class D4_K1{
	public static void main(String[] args){
		SnackList snackList = new SnackList();
		snackList.add(new Snack("�`���R���[�g",200));
		snackList.add(new Snack("�N�b�L�[",100));
		snackList.add(new Snack("�L�����f�B�[",300));
		snackList.add(new Snack("�|�e�g�`�b�v�X",250));
		snackList.add(new Snack("�r�X�P�b�g",150));
		
		String key = "�|�e�g�`�b�v�X";
		Snack snack = search(snackList, key);
		print(snack);
	}
	public static Snack search(SnackList snackList, String key){
		int low = 0;
		int high = snackList.size() - 1;
		while(low <= high){
			int middle = (low + high) / 2;
			Snack snack = snackList.get(middle);
			String name = snack.getName();
			if(key.compareTo(name) == 0){
				return snack;
			}else if (key.compareTo(name) < 0){
				high = middle - 1; 
			}else {
				low = middle + 1;
			}
		}
		return null;
	}
	public static void print(Snack snack){
		System.out.print(snack.getName() + " " + snack.getPrice());
	}
}