public class WaveNumbers40For {
    public static void main(String[] args) {
        line();
        pattern();
        digits();
        line();

    }
    public static void line() {
        for (int a = 40; a > 0; a--) {
            System.out.print("-");
        }
        System.out.println("");
    }
    public static void pattern() {
        for (int b = 10; b > 0; b--) {
            System.out.print("_-^-");
        }
        System.out.println("");
    }
    public static void digits() {
        for (int c = 2; c > 0; c --) {
            for (int d = 1; d < 10; d ++) {
                for (int e = 2; e > 0; e --) {
                    System.out.print(d);
                }
            }
            System.out.print("00");
        }
        System.out.println("");
    }
}
