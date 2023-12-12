public class Ex4_3{
	public static void main(String[] args){
		double x, y;
		double h;
		double ds ,s;
		
		h = 0.1;
		x = 0.0;
		s = 0.0;
		
		for(int i=0; i<(int)(1/h); i++){//h が 0.1 のとき 10 個の矩形を計算する
			y = 3 * x * x;// y=3x^2 を計算（^2 は 2 乗を意味する）
			ds = y * h;//一つの矩形領域の面積を計算
			s = s + ds;//定積分値に矩形面積を加える
			x = x + h;//x を刻み幅の分だけ増やす
		}
		System.out.println(s);//面積の出力
	}
} 