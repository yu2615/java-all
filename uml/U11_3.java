import java.util.List;

public class U11_3{
	public static void main(String[] args){
		EducateeList educateeList = RecordDB.getEducateeList();
		EducateeListManager eManager = new EducateeListManager(educateeList);
		//
		String keyId = "s001";
		System.out.println("search");
		List<String> list = eManager.searchSubjectNameById(keyId);
		int size = list.size();
		for(int i = 0; i < size; i++){
			String s = list.get(i);
			System.out.println(i + ":" + s);
		}
	}
}