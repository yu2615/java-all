public class B10_1 {
	public static void main (String[] args) {
		MobileTelephone phone = new MobileTelephone();
		phone.addApplication(new CurrentTimeClock());
		phone.addApplication(new Clock());
		phone.addApplication(new Clock24(17, 03, 00));
		phone.execute(2);
	}
}