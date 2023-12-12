public class A7_60 {
	public static void main (String[] args) {
		int n = 3;
		function (4 <= n && n < 10);
		function (3 == n);
		function (3 <= n && n < 4);
		function (3 < n || n < 4);
	}
	public static void function (boolean b) {
		String message = "";
		if (b) {
			message = "^";
		}else {
			message = "‹U";
		}
		System.out.println (message);
	}
}