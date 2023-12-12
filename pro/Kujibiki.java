public class Kujibiki {
	public static void main (String[] args) {
		int number = Kuji.getNumber();
		System.out.println ("‚­‚¶‚Ì”Ô†F" + number);
		String prize = Kuji.getPrize (number);
		System.out.println (prize + "‚ª“–‚½‚è‚Ü‚µ‚½");
	}
}