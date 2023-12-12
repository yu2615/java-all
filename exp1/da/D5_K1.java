public class D5_K1{
	public static void main(String[] args){
		String[] snacks = {"チョコレート", "クッキー", "キャンディー", "ポテトチップス", "ビスケット"};
		print(snacks);
		System.out.println("sort");
		sort(snacks);
		print(snacks);
	}
	public static void sort(String[] a){
		int size = a.length;
		for(int i = 0; i < size - 1; i++){
			for(int j = 0; j < size - 1 - i; j++){
				String v1 = a[j];
				String v2 = a[j + 1];
				if(v1.compareTo(v2) > 0){
					String temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
			//print(a);
		}
	}
	public static void print(String[] a){
		for(String v : a){
			System.out.print(v + " ");
		}
		System.out.println();
	}
}