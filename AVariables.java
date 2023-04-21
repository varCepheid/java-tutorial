public class AVariables {
    public static void main() {
        int number;
        number = 100;
        short smallNumber = 3;
        byte negativeNumber = -2;
        long hugeNumber = 1000000000l;
        int otherNumber;

        float decimal = 0.1f;
        double tinyNumber = 0.000000001d;

        char a = 'a';
        char A = 65;
        print(A); // A
        String str = "text here";

        boolean javaIsCool = true;

        print(smallNumber + number); // 103
        print(number - 20); // 80
        print(negativeNumber * 7); // -14
        print(hugeNumber / number); // 10000000d

        otherNumber = 35;
        print(otherNumber % smallNumber); // 2

        print(str + " more text"); // "text here more text"
        print(str + smallNumber); // "text here3"
        print(str + a); // ERROR

        boolean equals = (smallNumber == 3);
        boolean notEquals = (number != 120);
        boolean greater = (number > 120);

        print((equals || notEquals) && !greater); // true

        // single line comment
        /*
         * multi-line comment
         */
        print("error time!");
    }
}
