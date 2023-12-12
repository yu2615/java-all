public class D7_K1{
	public static void main(String[] args){
		SingleCell sc1 = new SingleCell("�t");
		SingleCell sc2 = new SingleCell("��");
		SingleCell sc3 = new SingleCell("�H");
		SingleCell sc4 = new SingleCell("�~");
		sc1.setNext(sc2);
		sc2.setNext(sc3);
		sc3.setNext(sc4);
		sc4.setNext(sc1);
		//
		print(sc1, 6);
	}
	public static void print(SingleCell start, int size){
		SingleCell sc = start;
		for(int i = 0; i < size; i++){
			System.out.println(i + " " + sc.getData());
			sc = sc.getNext();
		}
	}
}