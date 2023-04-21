public class EMethods {
  public static void printFact() {
    print("Java is a great language!");
  }

  /**
   * Calculate the sum of all integers up to a particular number.
   * 
   * @param end the last number to include
   * 
   * @return the sum
   */
  public static int sum(int end) {
    int sum = 0;
    for (int i = 0; i <= end; i++) {
      sum += i;
    }
    return sum;
  }

  public static int recursiveSum(int end, String printable) {
    int sum = 0;
    if (end > 1) {
      sum = recursiveSum(end - 1, printable);
      print(printable);
    }
    return sum + end;
  }

  public static void main() {
    printFact(); // "Java is a great language!"

    print(sum(2)); // 3
    int bigNumber = 99;
    print(sum(bigNumber)); // 4950

    print(recursiveSum(2, "Java")); // "Java", 3
    print(recursiveSum(99, "-")); // 98 "-"s, 4950
  }
}
