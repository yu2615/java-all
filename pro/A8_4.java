import jp.tdu.util.KeyboardReader;
public class A8_4 {
	public static void main (String[] args) {
		System.out.print ("����:");
		int a = KeyboardReader.readInt();
		if ( ( a >= 0 ) && ( a <= 100 )) {
			System.out.println(A8_4.getExamInformation(a));
		} else {
			System.out.println ("0�_�ȏ�A100�_�ȉ�����͂��Ă�������");
		} 
	}
	public static String getExamInformation (int score) {
		String message = "";
		if (score >= 90) {
			message = "�]����S�ł�";
		} else if (score >= 80) {
			message = "�]����A�ł�";
		} else if (score >= 70) {
			message = "�]����B�ł�";
		} else if (score >= 60) {
			message = "�]����C�ł�";
		} else if (score >= 0) {
			message = "�]����D�ł�";
		}
		return message;
	}
}