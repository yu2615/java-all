import java.java.time.LocalDate;
import java.time.Period;

@FunctionalInterface
public interface DOBUtil{
	public LocalDate getDOB();
	default public int getAge(LocalDate date){
		return Period.between(this.getDOB(), date).getYears;
	}
	default public int getAge(){
		return this.getAge(LocalDate.now());
	}
}