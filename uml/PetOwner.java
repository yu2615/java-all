import java.util.ArrayList;
import java.util.List;
public class PetOwner{
	private String name;
	private List<Pet> list = new ArrayList<Pet>();
	public PetOwner(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void addPet(Pet pet){
		this.list.add(pet);
	}
	public Pet getPet(int index){
		return this.list.get(index);
	}
	public int size(){
		return this.list.size();
	}
	public String say(String name, String s){
		String message = this.name + ":" + s + "->";
		int size = this.list.size();
		for(int i = 0; i < size; i++){
			Pet pet = this.list.get(i);
			if(name.equals(pet.getName() )){
				message = message + pet.getName() + ":" + pet.say(s) + " ";
			}
		}
		return message;
	}
}