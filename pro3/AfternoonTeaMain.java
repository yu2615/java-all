public class AfternoonTeaMain {
	public static void main (String[] args) {
		AfternoonTea afternoonTea = new AfternoonTea();
		afternoonTea.setTea(new Tea("ダージリン", 300));
		afternoonTea.addCake(new HotCake("メープル", 600));
		afternoonTea.addCake(new RollCake("フルーツ", 700));
		afternoonTea.print();
		System.out.println("合計" + afternoonTea.getTotalPrice() + "円");
	}
}