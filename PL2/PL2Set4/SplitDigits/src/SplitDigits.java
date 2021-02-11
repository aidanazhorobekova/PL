import java.util.Scanner;

public class SplitDigits {
    public static void main(String[] args) {
        splitDigits();

    }
    public static void splitDigits(){
        Scanner scn = new Scanner(System.in);
        String number = scn.next();
        number.split("");
        int i = 0;

        if (number.length() > 5) {
            System.out.println("Number is too long!");
        } else if (number.length() < 5) {
            System.out.println("Number is too short!");
        } else {
            while (i < number.length()) {
                System.out.println(number.charAt(i));
                i ++;
            }
        }
    }
}
