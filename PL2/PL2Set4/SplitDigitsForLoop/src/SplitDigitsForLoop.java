import java.util.Scanner;

public class SplitDigitsForLoop {
    public static void main(String[] args) {
        splitDigits();
    }
    public static void splitDigits() {
        Scanner scn = new Scanner(System.in);
        String input = scn.next();

        input.split("");

        if (input.length() > 5) {
            System.out.println("Number is too long!");
        } else if (input.length() < 5) {
            System.out.println("Number is too short!");
        } else {
            for (int i = 0; i < input.length(); i ++) {
                System.out.println(input.charAt(i));
            }
        }
    }
}
