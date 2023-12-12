import java.util.List;

public class U12_3{
	public static void main(String[] args){
		EducateeList educateeList = RecordDB.getEducateeList();
		EducateeListManager eManager = new EducateeListManager(educateeList);
		//
		String keyId = "s001";
		List<String> list = eManager.searchSubjectNameById(keyId);
		int size = list.size();
		for(int i = 0; i < size; i++){
			String s = list.get(i);
			System.out.println(i + ":" + s);
		}
		int index = keyboard.inputInt("”Ô†‘I‘ð>");
		//
		String keySubjectName = list.get(index);
		System.out.println(keySubjectName + "‚ª‘I‘ð‚³‚ê‚Ü‚µ‚½");
	}
}