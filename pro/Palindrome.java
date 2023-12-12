public class Palindrome {
	public static void main (String[] args) {
		System.out.println (getWord ("‚±", "‚½", "‚Â"));
		System.out.println (getWord ("‚¢", "‚©", "‚Æ"));
		System.out.println (getRepeat("‚Æ‚Ü‚Æ", 2));
	}
	public static String getWord (String str1, String str2, String str3) {
		return str1 + str2 + str3 + str2 + str1;
	}
	public static String getRepeat (String word, int times) {
		String s = "";
		for (int i = 0; i < times; i++) {
			s = s + word;
		}
		return s;
	}
}