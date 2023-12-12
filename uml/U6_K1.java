public class U6_K1{
	public static void main(String[] args){
		Station tokyo = new Station("ìåãû");
		Station kanda = new Station("ê_ìc");
		Station akihabara = new Station("èHótå¥");
		Station okachimachi = new Station("å‰ìkí¨");
		Station ueno = new Station("è„ñÏ");
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