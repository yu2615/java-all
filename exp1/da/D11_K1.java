import java.util.List;

public class D11_K1{
	public static void main(String[] args){
		Node node1 = new Node("-");
		Node node2 = new Node("/");
		Node node3 = new Node("*");
		Node node4 = new Node("+");
		Node node5 = new Node("25");
		Node node6 = new Node("5");
		Node node7 = new Node("2");
		Node node8 = new Node("3");
		Node node9 = new Node("4");
		//
		node1.setLeft(node2);
		node1.setRight(node9);
		node2.setLeft(node3);
		node2.setRight(node8);
		node3.setLeft(node4);
		node3.setRight(node7);
		node4.setLeft(node5);
		node4.setRight(node6);
		
		Traverser traverser = new Traverser(Order.POSTORDER);
		List<Object>list = traverser.getList(node1);
		Calculator calculator = new Calculator();
		System.out.print("Formula:");
		for(Object object : list){
			String s = object.toString();
			System.out.print(s + " ");
			calculator.addToken(s);
		}
		System.out.println();
		System.out.println("Answer:" + calculator.answer());
		System.out.println("Stack empty:" + calculator.empty());
	}
}