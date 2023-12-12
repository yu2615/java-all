public class Palindrome {
	public static void main (String[] args) {
		System.out.println (getWord ("こ", "た", "つ"));
		System.out.println (getWord ("い", "か", "と"));
		System.out.println (getRepeat("とまと", 2));
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