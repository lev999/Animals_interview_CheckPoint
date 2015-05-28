package animals;

public class DoLunch {

	public static void main(String[] args) throws Exception {

		Cow cow = new Cow(new Grass());
		cow.eat();
		Eagle eagle = new Eagle(new Meat());
		eagle.eat();
	}
}
