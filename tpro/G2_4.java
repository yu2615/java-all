public class G2_4{
	public static void main(String[] args){
		Undergraduate[] list1 = {
            new Undergraduate("00AJ02", 3.5),
            new Undergraduate("00AJ01", 3.3),
            new Undergraduate("00AJ04", 2.5),
            new Undergraduate("00AJ00", 1.8),
            new Undergraduate("00AJ05", 2.3)
		};
		
		Integer[] list2 = {5, 2, 3, 9,1};
		
		for(Undergraduate o: sort(list1)){
			System.out.println(o.getId() + " " + o.getGpa());
		}
		
		for(Integer o: sort(list2)){
			System.out.println(o);
		}
	}
	
	public static <T extends Comparable<T>> T[] sort(T[] list){
		/*for(Object o:list){
			System.out.print(o instanceof Comparable);
			System.out.println(":" + o);
		}*/
		for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length -1 - i; j++) {
                T v1 = list[j];
                T v2 = list[j + 1];
            	/*if(v1 instanceof Comparable){
            		Comparable c1 = (Comparable)v1;
            		Comparable c2 = (Comparable)v2;*/
                if (v1.compareTo(v2) > 0) {
                    T temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
		return list;
	}
}