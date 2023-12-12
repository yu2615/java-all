public class TelephoneMain {
	public static void main (String[] args) {
		String sep1 = Telephone.getSeparator (12, "=");
		String sep2 = Telephone.getSeparator (3, "-");
		String num1 = Telephone.getNumber ("03", "5284", "5120");
		String num2 = Telephone.getNumber ("0476", "46", "4111");
		System.out.println (sep1);
		System.out.println (num1);
		System.out.println (sep2);
		System.out.println (num2);
		System.out.println (sep1);
	}
}