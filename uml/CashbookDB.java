public class CashbookDB{
	public static Cashbook getCashbook(){
		Cashbook cashbook = new Cashbook();
		cashbook.setName("�ƌv��");
		cashbook.add(new Income("1/1", "����", "����", 100000));
		cashbook.add(new Expense("1/2", "�x�o", "�O�H", 1500));
		cashbook.add(new Expense("1/3", "�x�o", "����", 1000));
		cashbook.add(new Expense("1/5", "�x�o", "�ƒ�", 50000));
		cashbook.add(new Expense("1/7", "�x�o", "�ߗ�", 5000));
		return cashbook;
	}
}