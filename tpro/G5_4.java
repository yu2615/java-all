import java.time.LocalDate;
import java.time.Period;

public class G5_4{
	public static void main(String[] args){
		DOBUtil u1 = () -> LocalDate.of(2000, 5, 16);
		DOBUtil u2 = u1.plus(Period.ofYears(1));
		System.out.println(u1.getAge());
		System.out.println(u2.getAge());
	}
}