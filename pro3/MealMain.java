public class MealMain{
	public static void main (String[] args) {
		Meal meal = new Meal();
		meal.addSideDish(new FriedFood("����", 200));
		meal.addSideDish(new MisoSoup("���", 100));
		meal.print();
		System.out.println("���v" + meal.getTotalPrice() + "�~");
	}
}