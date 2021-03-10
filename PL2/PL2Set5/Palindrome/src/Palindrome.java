import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        long number = scanner.nextLong();
        boolean answer = false;
        if (number < 10) {
            answer = true;
        }
        while(number >= 10) {
            long end = number % 10;
            long start = number;
            int dif = 1;
            while (start >= 10) {
                start = start /10;
                dif = dif * 10;
            }
            System.out.println(end +" " + start);
            if (end == start) {
                answer = true;

            } else {
                answer = false;
                break;
            }
            number = number - start * dif;
            number = number / (end * 10);

        }

        if (answer) {
            System.out.println("This number is a palindrome");
        } else {
            System.out.println("This number is not a palindrome");
        }
    }
}
