public class SpacedNumbers {
    public static void main(String[] args) {
        int a = 4;
        int b = 1;
        int c = a;

        while (b < 6) {
            while (a > 0) {
                System.out.print(" ");
                a --;
            }
            System.out.print(b + "\n");
            b ++;
            c --;
            a = c;
        }
    }
}
