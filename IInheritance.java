public class IInheritance {
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

		public int simpleMethod() {
			return 2;
		}

		public static class Student extends Person {
			String school;

			public Student(String name, int age, int favNumber, String schoolAt) {
				super(name, age, favNumber);
				school = schoolAt;
			}

			public void moreInfo() {
				print(name + " is currently enrolled at " + this.school + ". They are in " + (age - 5) + "th grade.");
			}

			@Override
			public int simpleMethod() {
				return 34;
			}
		}
	}

	public static void main() {
		Person amanda = new Person("Amanda", 20, 576);
		amanda.info(); // "Amanda is 20 years old. Their favorite number is 576."
		print(amanda.simpleMethod()); // 2

		Person.Student barryS = new Person.Student("Barry", 10, 24, "Washington Middle School");
		barryS.info(); // "Barry is 10 years old. Their favorite number is 24."
		barryS.moreInfo(); // "Barry is currently enrolled at Washington Middle School. They are in 5th
												// grade."
		print(barryS.simpleMethod()); // 34
	}
}
