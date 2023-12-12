public class NodeMain{
	public static void main (String[] args) {
		Node leaf1 = new Leaf("リ");
		Node leaf2 = new Leaf("ス");
		Node branch1 = new Branch(leaf1, leaf2);
		Node leaf3 = new Leaf("マ");
		Node leaf4 = new Leaf("ス");
		Node leaf5 = new Leaf("ク");
		Node branch2 = new Branch(leaf3, leaf4);
		Node branch3 = new Branch(leaf5, leaf1);
		Node root = new Branch(branch3, branch2);
		root.print();
	}
}