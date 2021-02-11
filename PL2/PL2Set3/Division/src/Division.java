import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a dividend: ");
        int dent = scanner.nextInt();
        System.out.println("Enter a divisor: ");
        int sor = scanner.nextInt();

        if (sor == 0 ) {
            System.out.println("Incorrect input!");
        } else {
            int quot = dent / sor;
            System.out.println("Quotient is : " + quot);
        }
    }
}
