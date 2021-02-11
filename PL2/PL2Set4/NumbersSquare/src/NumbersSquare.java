public class NumbersSquare {
    public static void main(String[] args) {
        int set = 1;
        int lines = 4;

        while (lines > 0) {
            while (set < 6) {
                System.out.print(set);
                set ++;
            }
            System.out.print("\n");
            lines --;
            set = 1;
        }
    }
}
