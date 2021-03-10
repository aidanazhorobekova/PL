import java.util.Scanner;

public class ShowTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println(showTwos(num));
    }
    public static int showTwos(int num) {
        int a = num;
        int b = 0;
        while(a % 2 == 0) {
            b ++;
            a /= 2;
        }
        System.out.print(num + " = ");
        for(int i = 0; i < b; i ++)
            System.out.print("2 * ");
        return a;
    }
}
