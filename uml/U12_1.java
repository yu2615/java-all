public class U12_1{
	public static void main(String[] args){
		EducateeList educateeList = RecordDB.getEducateeList();
		EducateeListManager eManager = new EducateeListManager(educateeList);
		//
		String keyId = keyboard.inputString("�w�Дԍ�>");
		Educatee educatee = eManager.searchEducateeById(keyId);
		if(educatee == null){
			System.out.println("�f�[�^������܂���");
			return;
		}
		System.out.println("�f�[�^������܂���");
	}
}