public class U13_1{
	public static void main(String[] args){
		Cashbook cashbook = CashbookDB.getCashbook();
		CashbookManager cm = new CashbookManager( cashbook );
		//
		System.out.println(cm.getName());
		System.out.println("����:" + cm.size());
		System.out.println("----");
		cm.print();
		System.out.println("----");
		System.out.println("�c��:" + cm.getRemainder2());
		//
		System.out.println("====");
		String name = "�x�o";
		Cashbook cashbook2 = cm.searchItemName(name);
		cashbook2.setName(name);
		CashbookManager cm2 = new CashbookManager(cashbook2);
		//
		System.out.println(cm2.getName());
		System.out.println("����:" + cm2.size());
		System.out.println("----");
		cm2.print2();
		System.out.println("----");
		System.out.println("���v:" + cm2.getSum());
	}
}