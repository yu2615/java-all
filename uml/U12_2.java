public class U12_2{
	public static void main(String[] args){
		System.out.println("0:全教科を選択する");
		System.out.println("1:科目名一覧を選択する");
		int number = keyboard.inputInt("番号を選択>");
		//
		if(number == 0){
			System.out.println("全科目を選択しました");
			return;
		}else if(number == 1){
			System.out.println("科目名一覧を選択しました");
		}
	}
}