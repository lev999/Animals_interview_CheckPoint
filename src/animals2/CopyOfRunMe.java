package animals2;
//Нужно отрефакторить код, так чтобы выдавалась ошибка на стадии компиляции если орла попытаться накормить травой, а корову мясом ;)
public class CopyOfRunMe {

	public static void main(String[] args) {
		new CopyOfRunMe().go();

	}

	private void go() {
		Cow cow = new Cow(new Grass());

		cow.eat();
		Eagle eagle = new Eagle(new Grass());
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

	class Cow {

		Food food;

		public Cow(Food food) {
			this.food = food;
		}

		public void eat() {
			System.out.println("i am Cow, eat: " + food);

		}

	}

	class Eagle {

		Food food;

		public Eagle(Food food) {
			this.food = food;
		}

		public void eat() {
			System.out.println("i am Eagle, eat: " + food);

		}
	}
}
