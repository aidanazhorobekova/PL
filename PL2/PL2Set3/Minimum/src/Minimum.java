import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        if (a > b && c > b || a > b && c == b ){
            System.out.println("The least of these three numbers is " + b);
        } else if (b > a && c > a || b > a && c == a ) {
            System.out.println("The least of these three numbers is " + a);
        } else if (a > c && b > c || a > c && b == c ) {
            System.out.println("The least of these three numbers is " + c);
        } else if (c > b && a == b) {
            System.out.println("The least of these three numbers is " + b);
        } else {
            System.out.println("They are all equal.");
        }
    }
}
