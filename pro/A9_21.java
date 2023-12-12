public class A9_21 {
	public static void main (String[] args) {
		for (int i = 0; i <= 6; i++) {
			int score = (i + 4) * 10;
			System.out.print (score+ " ");
			System.out.println (getGrade (getPoint(score)));
		}
	}
	public static String getGrade (int point) {
		String[] words = {"D", "C", "B", "A", "S"};
		String word = "";
		if (point >= 0 && point < words.length) {
			word = words[point];
		}
		return word;
	}
	public static int getPoint (int score) {
		int grade = 0;
		if (score >= 60 && score < 100) {
			grade = ((score - 50) / 10);
		} else if (score >= 100) {
			grade = 4;
		}
		return grade;
	}
}