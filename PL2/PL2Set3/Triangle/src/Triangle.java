import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        int d = a + b + c;
        if (d == 180 && a != 0 && b != 0 && c != 0){
            System.out.println("It is a valid triangle.");
        } else {
            System.out.println("It is not a valid triangle.");
        }
    }
}