public class Ex4_3{
	public static void main(String[] args){
		double x, y;
		double h;
		double ds ,s;
		
		h = 0.1;
		x = 0.0;
		s = 0.0;
		
		for(int i=0; i<(int)(1/h); i++){//h �� 0.1 �̂Ƃ� 10 �̋�`���v�Z����
			y = 3 * x * x;// y=3x^2 ���v�Z�i^2 �� 2 ����Ӗ�����j
			ds = y * h;//��̋�`�̈�̖ʐς��v�Z
			s = s + ds;//��ϕ��l�ɋ�`�ʐς�������
			x = x + h;//x �����ݕ��̕��������₷
		}
		System.out.println(s);//�ʐς̏o��
	}
} 