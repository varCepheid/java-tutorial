public class GConstructors {
	public static class Person {
		String name;
		int age;
		int favoriteNumber;

		public Person(String name, int age, int favNumber) {
			this.name = name;
			this.age = age;
			favoriteNumber = favNumber;
		}

		public void info() {
			print(this.name + " is " + age + " years old. Their favorite number is " + favoriteNumber + ".");
		}
	}

	public static void main() {
		Person amanda = new Person();
		amanda.name = "Amanda";
		amanda.age = 20;
		amanda.favoriteNumber = 576;
		amanda.info(); // "Amanda is 20 years old. Their favorite number is 576."

		Person barry = new Person("Barry", 60, 2401);
		barry.info(); // "Barry is 60 years old. Their favorite number is 2401."

		barry.age = 65;
		barry.favoriteNumber = 5407;
		barry.info(); // "Barry is 65 years old. Their favorite number is 5407."
	}
}
