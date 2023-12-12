public class U12_1{
	public static void main(String[] args){
		EducateeList educateeList = RecordDB.getEducateeList();
		EducateeListManager eManager = new EducateeListManager(educateeList);
		//
		String keyId = keyboard.inputString("学籍番号>");
		Educatee educatee = eManager.searchEducateeById(keyId);
		if(educatee == null){
			System.out.println("データがありません");
			return;
		}
		System.out.println("データがありました");
	}
}