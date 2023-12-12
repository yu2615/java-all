import java.util.ArrayList;
import java.util.List;
public class FruitBasket{
	private List<Fruit> list = new ArrayList<Fruit>();
	public FruitBasket(){
	}
	public void add(Fruit fruit){
		this.list.add(fruit);
	}
	public Fruit get(int index){
		return this.list.get(index);
	}
	public int size(){
		return this.list.size();
	}
	public Fruit remove(int index){
		return this.list.remove(index);
	}
	public String getName(){
		String name = "";
		int size = this.list.size();
		for(int i = 0; i < size; i++){
			Fruit fruit = this.list.get(i);
			name = name + fruit.getName() + " ";
		}
		return name;
	}
	public int getPrice(){
		int sum = 0;
		int size = this.list.size();
		for(int i = 0; i < size; i++){
			Fruit fruit = this.list.get(i);
			sum = sum + fruit.getPrice();
		}
		return sum;
	}
}