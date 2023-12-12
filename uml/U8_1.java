public class U8_1{
	public static void main(String[] args){
		Subject subject = new Subject("UML‰‰K");
		Task task = new Task("‰Û‘è");
		task.setScore(90);
		task.setNumber(1);
		subject.add(task);
		Report report = new Report("ƒŒƒ|[ƒg‚P");
		report.setScore(85);
		subject.add(report);
		Test test = new Test("Œ±");
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