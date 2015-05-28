package animals;

public class Eagle<T extends Meat> implements Lunch {

	T food;

	public Eagle(T food) {
		this.food = food;
	}

	@Override
	public void eat() {
		System.out.println("i am Eagle, eat: " + food);

	}
}
