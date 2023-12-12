public class A9_3 {
	public static void main (String[] args) {
		int[] scores = {90, 80, 60, 50};
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			//System.out.println (scores[i]);
			sum = scores[i] + sum;
		}
		//System.out.println ("‡Œv:" + sum);
		System.out.println ("•½‹Ï:" + (sum/ scores.length));
	}
}