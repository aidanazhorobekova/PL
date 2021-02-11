public class WaveNumbers40 {
    public static void main(String[] args) {
        int four = 4;
        int ten = 1;
        int two = 2;
        int rep = 2;

        straight(four, ten);
        pattern(ten);
        digits(two, ten, rep);
        straight(four, ten);

    }
    public static void straight(int four, int ten) {
        while (four > 0) {
            while (ten < 11) {
                System.out.print("-");
                ten ++;
            }
            four --;
            ten = 1;
        }
        System.out.println("");
    }
    public static void pattern(int ten) {
        while (ten < 11) {
            System.out.print("_-^-");
            ten ++;
        }
        System.out.println("");
    }
    public static void digits(int two, int ten, int rep) {
        while (two > 0) {
            while (ten < 10) {
                while (rep > 0) {
                    System.out.print(ten);
                    rep --;
                }
                ten ++;
                rep = 2;
            }
            while (ten == 10) {
                System.out.print("00");
                break;
            }
            two --;
            ten = 1;
        }
        System.out.println("");
    }
}
