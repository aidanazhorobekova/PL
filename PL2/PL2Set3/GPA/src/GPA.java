import java.util.Scanner;

public class GPA {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float score = scn.nextFloat();

        if (score >= 93 && score <= 100){
            System.out.println("A 4.0");
        } else if (score >= 90 && score <= 92) {
            System.out.println("A- 3.67");
        } else if (score >= 87 && score <= 89) {
            System.out.println("B+ 3.33");
        } else if (score >= 83 && score <= 86) {
            System.out.println("B 3.0");
        } else if (score >= 80 && score <= 82) {
            System.out.println("B- 2.67");
        } else if (score >= 77 && score <= 79) {
            System.out.println("C+ 2.33");
        } else if (score >= 70 && score <= 76) {
            System.out.println("C 2.0");
        } else if (score >= 60 && score <= 69) {
            System.out.println("D 1.0");
        } else if (score >= 0 && score <= 59) {
            System.out.println("F 0.0");
        } else {
            System.out.println("Incorrect grade!");
        }
    }
}
