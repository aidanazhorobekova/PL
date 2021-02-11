import java.util.Scanner;

public class HelloOrBye {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String letter = scn.nextLine();
        String word = "Hello World!";

        if (word.toLowerCase().contains(letter.toLowerCase())) {
            System.out.println("Hello");
        } else {
            System.out.println("Bye");
        }
    }
}