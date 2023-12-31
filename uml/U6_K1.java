public class U6_K1{
	public static void main(String[] args){
		Station tokyo = new Station("東京");
		Station kanda = new Station("神田");
		Station akihabara = new Station("秋葉原");
		Station okachimachi = new Station("御徒町");
		Station ueno = new Station("上野");
		tokyo.setDown(kanda);
		kanda.setUp(tokyo);
		kanda.setDown(akihabara);
		akihabara.setUp(kanda);
		akihabara.setDown(okachimachi);
		okachimachi.setUp(akihabara);
		okachimachi.setDown(ueno);
		ueno.setUp(okachimachi);
		printDown(tokyo);
		System.out.println("");
		printUp(ueno);
	}
	public static void printDown(Station start){
		Station station = start;
		while(station != null){
			System.out.println(station.getName());
			station = station.getDown();
		}
	}
	public static void printUp(Station start){
		Station station = start;
		while(station != null){
			System.out.println(station.getName());
			station = station.getUp();
		}
	}
}