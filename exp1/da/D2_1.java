public class D2_1{
	public static void main(String[] args){
		Paper paper = new Paper();
		paper.setText("�f�[�^�\���ƃA���S���Y��");
		print(paper);
	}
	public static void print(Paper paper){
		System.out.println("text:" + paper.getText());
	}
}