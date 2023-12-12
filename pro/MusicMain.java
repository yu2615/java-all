public class MusicMain {
	public static void main (String[] args) {
		for (int i = 0; i < 8; i++) {
			int n = i % 7;
			String scale = Music.getScale(n);
			System.out.println (i + "->" + scale);
		}
	}
}