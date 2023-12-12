import java.util.List;

public class StudentCUI{
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
		//
		System.out.println("0:全教科を選択する");
		System.out.println("1:科目名一覧を選択する");
		int number = keyboard.inputInt("番号を選択>");
		if(number == 0){
			System.out.println("全科目を選択しました");
			//
			RecordUtils.print(educatee);
			return;
		}else if(number == 1){
			System.out.println("科目名一覧を選択しました");
		}else{
			System.out.println("番号が間違っています");
			return;
		}
		//
		List<String> subjectNames = eManager.searchSubjectNameById(keyId);
		for(int i = 0; i < subjectNames.size(); i++){
			System.out.println(i + ":" + subjectNames.get(i));
		}
		//
		int index = keyboard.inputInt("番号選択>");
		String keySubjectName = subjectNames.get(index);
		//
		Subject subject = eManager.searchSubjectById(keyId, keySubjectName);
		RecordUtils.print(subject);
	}
}