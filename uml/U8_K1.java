public class U8_K1{
	public static void main(String[] args){
		Subject subject = new Subject("コンピュータプログラミング");
		Report report = new Report("レポート１");
		report.setScore(85);
		subject.add(report);
		report = new Report("レポート2");
		report.setScore(80);
		subject.add(report);
		report = new Report("レポート3");
		report.setScore(90);
		subject.add(report);
		Test test = new Test("試験");
		test.setScore(95);
		subject.add(test);
	}
	public static void print(Record record){
		System.out.print(record.getName() + " ");
		System.out.println(record.getScore());
	}
	public static void print(Subject subject){
		System.out.println(subject.getName());
		int size = subject.size();
		for(int i = 0; i < size; i++){
			Record record = subject.get(i);
			print(record);
		}
	}
}