import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();

        if (number == 0 ){
            System.out.println("0 is not odd nor even");
        } else if (number % 2 == 0 ){
            System.out.println("This number is even");
        } else {
            System.out.println("This number is odd");
        }
    }
}
