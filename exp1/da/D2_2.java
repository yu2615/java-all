public class D2_2{
	public static void main(String[] args){
		Note note = new Note();
		Paper paper0 = note.get(0);
		paper0.setText("�f�[�^�\��");
		Paper paper1 = note.get(1);
		paper1.setText("�A���S���Y��");
		print(note);
	}
	public static void print(Note note){
		for(int i = 0; i < note.size(); i++){
			Paper paper = note.get(i);
			System.out.print("page:" + i + " ");
			System.out.println("text:" + paper.getText());
			//System.out.println("text:" + paper.getText());
		}
	}
}