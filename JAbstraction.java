public class JAbstraction {
	public static abstract class Person {
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

		public int simpleMethod() {
			return 2;
		}
	}

	public static class Student extends Person {
		String school;

		public Student(String name, int age, int favNumber, String schoolAt) {
			super(name, age, favNumber);
			school = schoolAt;
		}

		public void moreInfo() {
			print(this.name + " is currently enrolled at " + this.school + ". They are in " + (this.age - 5) + "th grade.");
		}

		@Override
		public int simpleMethod() {
			return this.age + this.favoriteNumber;
		}
	}

	public static void main() {
		Person amanda = new Person("Amanda", 20, 576);

		Student barry = new Student("Barry", 10, 24, "Washington Middle School");
		barry.info(); // Barry is 10 years old. Their favorite number is 24.
		barry.moreInfo(); // Barry is currently enrolled at Washington Middle School. They are in 5th
											// grade.
		print(barry.simpleMethod()); // 34
	}
}
