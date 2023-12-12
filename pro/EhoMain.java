public class EhoMain {
	public static void main (String[] args) {
		int year = 2017;
		int number = year % 5;
		String lucky = Eho.getLucky (number);
		System.out.println (year + "”N‚ÌŒb•û‚Í" + lucky);
	}
}