public class U7_K1{
	public static void main(String[] args){
		PetOwner petOwner = new PetOwner("ザキトワ");
		petOwner.addPet(new Dog("マサル"));
		petOwner.addPet(new Cat("イリ―スカ"));
		
		System.out.println(petOwner.say("マサル","こんにちは"));
		System.out.println(petOwner.say("イリースカ","こんにちは"));
	}
}