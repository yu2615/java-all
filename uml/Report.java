public class Report implements Record{
	private String name;
	private int score = 0;
	public Report(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setScore(int score){
		this.score = score;
	}
	public int getScore(){
		return this.score;
	}
}