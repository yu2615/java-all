public class Leaf implements Node{
	private String word;
	public Leaf(String word){
		this.word = word;
	}
	public void print() {
		System.out.print(word);
	}
}