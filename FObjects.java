public class FObjects {
  class Person {
    String name;
    int age;
    int favoriteNumber;

    public void info() {
      print(name + " is " + age + " years old. Their favorite number is " + favoriteNumber + ".");
    }
  }

  public static void main() {
    String name = "Amanda";
    int age = 20;
    int favoriteNumber = 576;
    print(name + " is " + age + " years old. Their favorite number is " + favoriteNumber + "."); // Amanda is 20 years
                                                                                                 // old. Their favorite
                                                                                                 // number is 576.

    String name2 = "Barry";
    int age2 = 60;
    int favoriteNumber2 = 2401;
    print(name2 + " is " + age2 + " years old. Their favorite number is " + favoriteNumber2 + "."); // Barry is 60 years
                                                                                                    // old. Their
                                                                                                    // favorite number
                                                                                                    // is 2401.

    Person amanda = new Person();
    print(amanda.name); // null
    amanda.name = "Amanda";
    amanda.age = 20;
    amanda.favoriteNumber = 576;
    amanda.info(); // Amanda is 20 years old. Their favorite number is 576.
  }
}
