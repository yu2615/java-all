public class AfternoonTeaMain {
	public static void main (String[] args) {
		AfternoonTea afternoonTea = new AfternoonTea();
		afternoonTea.setTea(new Tea("�_�[�W����", 300));
		afternoonTea.addCake(new HotCake("���[�v��", 600));
		afternoonTea.addCake(new RollCake("�t���[�c", 700));
		afternoonTea.print();
		System.out.println("���v" + afternoonTea.getTotalPrice() + "�~");
	}
}