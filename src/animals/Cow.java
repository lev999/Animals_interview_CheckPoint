package animals;

public class Cow<T extends Grass> implements Lunch {

	T food;

	public Cow(T food) {
		this.food = food;
	}

	@Override
	public void eat() {
		System.out.println("i am Cow, eat: " + food);

	}

}
