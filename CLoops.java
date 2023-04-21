public class CLoops {
  public static void main() {
      int counter = 0;
      while(counter < 5) {
        print("The number is " + counter + ".");
        counter = counter + 1;
      } // "The number is 0." 1, 2, 3, 4

      counter = 0;
      int sum = 0;
      while(counter < 10) {
        sum += (counter * 2);
        counter++;
      }
      print(sum); // 90

      for(int i = 0; i < 5; i++) {
        print("The number is " + i);
      }

      int num = 1;
      sum = 0;
      while(true) {
        sum += num;
        if(sum > 100) {
          print(num);
          break;
        }
        num++;
      } // 14

      for(int i = 0; i < 10; i++) {
        if(i > 1 && i < 6) {
          continue;
        }
        print("The number is " + i);
      } // "The number is 0", 1, 6, 7, 8, 9
  }
}