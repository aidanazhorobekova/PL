import java.util.Scanner;

public class AgeControl {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int age = scn.nextInt();

        if (age <= 18 && age > 0 ){
            System.out.println("Too young!");
        } else if (age < 150 && age > 18 ){
            System.out.println("Old enough!");
        } else {
            System.out.println("Incorrect age.");
        }
    }
}
