public class U6_1{
	public static void main(String[] args){
		Station tokyo = new Station("����");
		Station kanda = new Station("�_�c");
		tokyo.setDown(kanda);
		kanda.setUp(tokyo);
		printDown(tokyo);
	}
	public static void printDown(Station start){
		Station station = start;
		while(station != null){
			System.out.println(station.getName());
			station = station.getDown();
		}
	}
}