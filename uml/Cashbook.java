import java.util.ArrayList;
import java.util.List;

public class Cashbook{
	private String name;
	private List<Item>list = new ArrayList<Item>();
	public Cashbook(){
		
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void add(Item item){
		this.list.add(item);
	}
	public Item get(int index){
		return this.list.get(index);
	}
	public int size(){
		return this.list.size();
	}
	public Item remove(int index){
		return this.list.remove(index);
	}
} 