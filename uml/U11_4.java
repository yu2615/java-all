public class U11_4{
	public static void main(String[] args){
		EducateeList educateeList = RecordDB.getEducateeList();
		EducateeListManager eManager = new EducateeListManager(educateeList);
		//
		String keyId = "001";
		String keySubjectName = "UML‰‰K";
		System.out.println("search");
		Subject subject = eManager.searchSubjectById(keyId, keySubjectName);
		RecordUtils.print(subject);
	}
}