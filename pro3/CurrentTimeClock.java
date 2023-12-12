import java.util.Calendar;
import java.util.Calendar.*;

public class CurrentTimeClock implements Application{
	public CurrentTimeClock(){
	}
	public void execute(){
		System.out.println("CurrentTimeClock");
		System.out.print(this.getYear() + "/");
		System.out.print(this.getMonth() + "/");
		System.out.println(this.getDate());
		System.out.print(this.getHour() + ":");
		System.out.print(this.getMinute() + ":");
		System.out.println(this.getSecond());
	}
	public int getYear(){
		Calendar calendar = Calendar.getInstance();
		return calendar.get(Calendar.YEAR);
	}
	public int getMonth(){
		Calendar calendar = Calendar.getInstance();
		return calendar.get(Calendar.MONTH) + 1;
	}
	public int getDate(){
		Calendar calendar = Calendar.getInstance();
		return calendar.get(Calendar.DATE);
	}
	public int getMinute(){
		Calendar calendar = Calendar.getInstance();
		return calendar.get(Calendar.MINUTE);
	}
	public int getHour(){
		Calendar calendar = Calendar.getInstance();
		return calendar.get(Calendar.HOUR_OF_DAY);
	}
	public int getSecond(){
		Calendar calendar = Calendar.getInstance();
		return calendar.get(Calendar.SECOND);
	}
}