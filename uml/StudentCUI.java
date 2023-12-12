import java.util.List;

public class StudentCUI{
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
		//
		System.out.println("0:�S���Ȃ�I������");
		System.out.println("1:�Ȗږ��ꗗ��I������");
		int number = keyboard.inputInt("�ԍ���I��>");
		if(number == 0){
			System.out.println("�S�Ȗڂ�I�����܂���");
			//
			RecordUtils.print(educatee);
			return;
		}else if(number == 1){
			System.out.println("�Ȗږ��ꗗ��I�����܂���");
		}else{
			System.out.println("�ԍ����Ԉ���Ă��܂�");
			return;
		}
		//
		List<String> subjectNames = eManager.searchSubjectNameById(keyId);
		for(int i = 0; i < subjectNames.size(); i++){
			System.out.println(i + ":" + subjectNames.get(i));
		}
		//
		int index = keyboard.inputInt("�ԍ��I��>");
		String keySubjectName = subjectNames.get(index);
		//
		Subject subject = eManager.searchSubjectById(keyId, keySubjectName);
		RecordUtils.print(subject);
	}
}