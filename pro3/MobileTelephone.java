import java.util.ArrayList;
public class MobileTelephone {
	private ArrayList<Application> list = new ArrayList<Application>();
	public MobileTelephone(){
	}
	public void addApplication (Application application) {
		this.list.add(application);
	}
	public void execute(int number) {
		if (number >= 0 && number < this.list.size()) {
			Application application = this.list.get(number);
			application.execute();
		}
	}
}