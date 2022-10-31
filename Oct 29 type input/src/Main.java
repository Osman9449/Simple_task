import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter the type( int, short, float): ");

            String inputString = scanner.nextLine();
            switch (inputString) {
                case "int":
                    System.out.println("Enter 3 int element : ");
                    multiplyMaxMin(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                    break;
                case "short":
                    System.out.println("Enter 3 short element : ");
                    multiplyMaxMin(scanner.nextShort(), scanner.nextShort(), scanner.nextShort());
                    break;
                case "float":
                    System.out.println("Enter 3 float element : ");
                    multiplyMaxMin(scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat());
                    break;
                default:
                    System.out.println("Type is incorrect , try again");
                    continue;
            }
            break;
        }
    }
    static void multiplyMaxMin(int a, int b, int c) {
        int max, min;
        max = a > b && a > c ? a : b > c && b > a ? b : c;
        min = a < b && a < c ? a : b < c && b < a ? b : c;
        System.out.println(min + "*" + max + "=" + max * min);
    }

    static void multiplyMaxMin(short a, short b, short c) {
        short max, min;
        max = a > b && a > c ? a : b > c && b > a ? b : c;
        min = a < b && a < c ? a : b < c && b < a ? b : c;
        System.out.println(min + "*" + max + "=" + max * min);
    }

    static void multiplyMaxMin(float a, float b, float c) {
        float min, max;
        max = a > b && a > c ? a : b > c && b > a ? b : c;
        min = a < b && a < c ? a : b < c && b < a ? b : c;
        System.out.println(min + "*" + max + "=" + max * min);

    }
}
