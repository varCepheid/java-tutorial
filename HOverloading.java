public class HOverloading {
	public static class Person {
		String name;
		int age;
		int favoriteNumber;

		public Person(String name, int age, int favNumber) {
			this.name = name;
			this.age = age;
			favoriteNumber = favNumber;
		}

		public Person(String name, int age) {
			this(name, age, 0);
		}

		public void info() {
			print(this.name + " is " + age + " years old. Their favorite number is " + favoriteNumber + ".");
		}
	}

	public static int sum(int end) {
		int sum = 0;
		for (int i = 1; i <= end; i++) {
			sum += i;
		}
		return sum;
	}

	public static int sum(int end, String printable) {
		int sum = 0;
		if (end > 1) {
			print(printable);
			sum = sum(end - 1, printable);
		}
		return sum + end;
	}

	public static void main() {
		print(sum(5)); // 15
		print(sum(5, "text")); // "text", "text" x5, 15

		Person amanda = new Person("Amanda", 20, 576);
		amanda.info(); // "Amanda is 20 years old. Their favorite number is 576."

		Person barry = new Person("Barry", 60);
		barry.info(); // "Barry is 60 years old. Their favorite number is 0."

		Person catherine = new Person("Catherine", 43560);
		catherine.info(); // "Catherine is 43560 years old. Their favorite number is 0."
	}
}
