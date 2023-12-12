public class A7_72 {
	public static void main (String[] args) {
		for (int i = 0; i < 7; i++) {
			int score = (i + 4) * 10;
			System.out.print (score+ " ");
			System.out.println (getGrade (score));
		}
	}
	public static int getGrade (int point) {
		int grade = 0;
		if (point >= 60 && point < 100) {
			grade = ((point - 50) / 10);
		} else if (point >= 100) {
			grade = 4;
		}
		return grade;
	}
}