public class U2_1{
	public static void main(String[] args){
		Laboratory laboratory1 = new Laboratory("A������",50997);
		Laboratory laboratory2 = new Laboratory("B������",50998);
		Laboratory laboratory3 = new Laboratory("C������",50897);
		laboratory1.setNumber(50997);
		laboratory2.setNumber(50998);
		laboratory3.setNumber(50897);
		String name1 = laboratory1.getName();
		int number1 = laboratory1.getNumber();
		String name2 = laboratory2.getName();
		int number2 = laboratory2.getNumber();
		String name3 = laboratory3.getName();
		int number3 = laboratory3.getNumber();
		System.out.println(name1 + " " + number1);
		System.out.println(name2 + " " + number2);
		System.out.println(name3 + " " + number3);
	}
}