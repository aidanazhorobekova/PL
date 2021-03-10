import java.util.Scanner;

public class Factorials {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int number = scanner.nextInt();
        factorialOf(number);
    }

    public static int factorialOf(int n) {
        int factorial = 1;
        System.out.println("X    X!");

        if (n == 0) {
            System.out.println("0    1");
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.print(i);
                for (int k = 1; k <= i; k++) {
                    factorial = factorial * k;

                }
                System.out.print("    " + factorial + "\n");
                factorial = 1;
            }
        }
        return factorial;
    }
}
