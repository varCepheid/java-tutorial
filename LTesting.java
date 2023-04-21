public class LTesting {
  public static void main(String[] args) {
    System.out.print("Here's a sentence!");
    System.out.println("Whoa, the spacing's weird!");

    int[] numbers = new int[4];
    try {
      print(numbers[4]);
    } catch (Exception ex) {
      throw new ArrayIndexOutOfBoundsException("numbers doesn't have an index 4");
    } finally {
      numbers[0] = 1;
    }
    print(numbers[0]); // 1
  }
}
