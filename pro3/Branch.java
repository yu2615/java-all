public class Branch implements Node{
	private Node left;
	private Node right;
	public Branch(Node left, Node right){
		this.left = left;
		this.right = right;
	}
	public void print() {
		left.print();
		right.print();
	}
}