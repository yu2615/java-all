public class RecordDB{
	public static EducateeList getEducateeList(){
		EducateeList educateeList = new EducateeList("�w�K�҃��X�g");
		Educatee educatee1 = new Educatee("s001", "Taro");
		Subject subject1 = new Subject("UML���K");
		Task task1 = new Task("�ۑ�P");
		task1.setNumber(1);
		task1.setScore(90);
		Report report1 = new Report("���|�[�g�P");
		report1.setScore(85);
		Test test1 = new Test("����");
		test1.setScore(95);
		
		educateeList.add(educatee1);
		educatee1.add(subject1);
		subject1.add(task1);
		subject1.add(report1);
		subject1.add(test1);
		
		Educatee educatee2 = new Educatee("s002", "Hanako");
		Subject subject2 = new Subject("UML���K");
		Task task2 = new Task("�ۑ�1");
		task2.setNumber(1);
		task2.setScore(80);
		Report report2 = new Report("���|�[�g�P");
		report2.setScore(90);
		Test test2 = new Test("����");
		test2.setScore(100);
		
		educateeList.add(educatee2);
		educatee2.add(subject2);
		subject2.add(task2);
		subject2.add(report2);
		subject2.add(test2);
		
		Subject subject3 = new Subject("�f�[�^�`��");
		Task task3 = new Task("�ۑ�P");
		task3.setNumber(1);
		task3.setScore(75);
		Report report3 = new Report("���|�[�g1");
		report3.setScore(70);
		Test test3 = new Test("����");
		test3.setScore(80);
		
		educatee1.add(subject3);
		subject3.add(task3);
		subject3.add(report3);
		subject3.add(test3);
		
		return educateeList;
	}
}