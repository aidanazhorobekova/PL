import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        if (score <= 100 && score >= 50){
            System.out.println("passed");
        } else if (score < 50 && score >= 0){
            System.out.println("failed");
        } else {
            System.out.println("Incorrect grade!");
        }
    }
}
