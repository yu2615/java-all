import jp.tdu.util.KeyboardReader;
public class A8_4 {
	public static void main (String[] args) {
		System.out.print ("成績:");
		int a = KeyboardReader.readInt();
		if ( ( a >= 0 ) && ( a <= 100 )) {
			System.out.println(A8_4.getExamInformation(a));
		} else {
			System.out.println ("0点以上、100点以下を入力してください");
		} 
	}
	public static String getExamInformation (int score) {
		String message = "";
		if (score >= 90) {
			message = "評価はSです";
		} else if (score >= 80) {
			message = "評価はAです";
		} else if (score >= 70) {
			message = "評価はBです";
		} else if (score >= 60) {
			message = "評価はCです";
		} else if (score >= 0) {
			message = "評価はDです";
		}
		return message;
	}
}