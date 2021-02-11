public class SpacesNumbers {
    public static void main(String[] args) {
        int a = 4;
        int b = 1;
        int c = a;
        int times = 1;

        while (b < 6) {
            while (a > 0) {
                System.out.print(" ");
                a --;
            }

            while (times <= b) {
                System.out.print(b);
                times ++;
            }
            System.out.print("\n");
            b ++;
            c --;
            a = c;
            times = 1;
        }
    }
}
