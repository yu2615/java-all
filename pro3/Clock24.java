public class Clock24 implements Application {
	private int hour;
	private int minute;
	private int second;
	public Clock24 (int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public void execute() {
		System.out.println ("Clock24");
		System.out.print (this.hour + ":");
		System.out.print (this.minute + ":");
		System.out.println (this.second);
	}
}