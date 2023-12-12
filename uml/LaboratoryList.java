import java.util.ArrayList;
import java.util.List;

public class LaboratoryList{
	private List<Laboratory> list = new ArrayList<Laboratory>();
	public LaboratoryList(){
		
	}
	public void add(Laboratory laboratory){
		this.list.add(laboratory);
	}
	public Laboratory get(int index){
		return this.list.get(index);
	}
	public Laboratory remove(int index){
		return this.list.remove(index);
	}
	public int size(){
		return this.list.size();
	}
}