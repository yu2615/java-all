import java.util.List;

public class D11_3{
	public static void main(String[] args){
		Node node1 = new Node("*");
		Node node2 = new Node("+");
		Node node3 = new Node("2");
		Node node4 = new Node("3");
		Node node5 = new Node("-");
		Node node6 = new Node("4");
		Node node7 = new Node("5");
		//
		node1.setLeft(node2);
		node1.setRight(node5);
		node2.setLeft(node3);
		node2.setRight(node4);
		node5.setLeft(node6);
		node5.setRight(node7);
		
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