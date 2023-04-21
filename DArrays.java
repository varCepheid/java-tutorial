public class DArrays {
  public static void main() {
    int num1 = 0;
    int num2 = 2;
    int num3 = 60;
    int num4 = 16254;

    int[] numbers = { 0, 2, 60, 16254 };
    print(numbers[1]); // 2
    numbers[2] = 34;
    print(numbers[2]); // 34
    print(numbers.length); // 4
    print(numbers[4]); // ERROR
    print(numbers); // unreadable

    String[] fruits = new String[3];
    print(fruits[0]); // undefined
    print(fruits.length); // 3
    fruits[0] = "apple";
    fruits[1] = "banana";
    fruits[2] = "cherry";
    print(fruits[0] + fruits[1] + fruits[2]); // "applebananacherry"

    for (int i : numbers) {
      print("I like the number " + i);
    } // "I like the number 0", 2, 34, 16254
  }
}
