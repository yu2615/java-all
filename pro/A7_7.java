public class A7_7 {
	public static void main (String[] args) {
		int a = 80;
		String message = "";
		if (a >= 90) {
			message = "�]����S�ł�";
		} else if ((a >= 80) && (a < 90)) {
			message = "�]����A�ł�";
		} else if ((a >= 70) && (a < 80)) {
			message = "�]����B�ł�";
		} else if ((a >= 60) && (a < 70)) {
			message = "�]����C�ł�";
		} else if ((a >= 0) && (a < 60)) {
			message = "�]����D�ł�";
		}
		System.out.println (message);
	}
}