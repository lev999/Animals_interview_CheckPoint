package animals2;

public class RunMe {

	public static void main(String[] args) {
		new RunMe().go();

	}

	private void go() {
		Cow cow = new Cow(new Grass());

		cow.eat();
		Eagle eagle = new Eagle(new Meat());
		eagle.eat();

	}

	public class Food {
	}

	class Grass extends Food {
		@Override
		public String toString() {

			return "grass";
		}
	}

	class Meat extends Food {

		@Override
		public String toString() {

			return "meat";
		}
	}

	class Cow<T extends Grass> {

		T food;

		public Cow(T food) {
			this.food = food;
		}

		public void eat() {
			System.out.println("i am Cow, eat: " + food);

		}

	}

	class Eagle<T extends Meat> {

		T food;

		public Eagle(T food) {
			this.food = food;
		}

		public void eat() {
			System.out.println("i am Eagle, eat: " + food);

		}
	}
}