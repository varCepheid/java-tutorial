public class BConditionals {
  public static void main() {
    boolean javaIsCool = true;
    if (javaIsCool) {
      print("Your first if-statement!");
    } // "Your first if-statement!"

    boolean condition = false;
    if (condition) {
      print("The condition is true.");
    } else {
      print("The condition is false.");
    }
    // "The condition is false."

    int number = 4;
    if (number > 0) {
      print("The number is positive.");
    } else if (number < 0) {
      print("The number is negative.");
    } else {
      print("The number is zero.");
    } // "The number is positive."

    int otherNumber = 5;
    switch (otherNumber) {
      case 0:
        print("The number is zero.");
        break;
      case 1:
        print("The number is positive.");
        break;
      case 2:
        print("The number is positive.");
        break;
      case -1:
      case -2:
      case -3:
        print("The number is negative.");
        break;
      default:
        print("The number is too big!");
    } // "The number is too big!"
  }
}
