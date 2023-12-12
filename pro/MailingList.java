public class MailingList {
	public static void main (String[] args) {
		String s1 = getLine (16, "=");
		String s2 = getLine (4, "-");
		System.out.println (s1);
		System.out.println (getAddress ("abc", "dendai.ac.jp"));
		System.out.println (s2);
		System.out.println (getAddress("boo", "tdu.jp"));
		System.out.println (s1);
	}
	public static String getAddress (String str1, String str2) {
		String s = "";
		s = str1 + "@" + str2;
		return s;
	}
	public static String getLine (int count, String str) {
		String s = "";
		for (int i = 0; i < count; i++) {
			s = s + str;
		}
		return s;
	}
}