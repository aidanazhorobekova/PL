public class NumbersTriangle {
    public static void main(String[] args) {
        int lines = 1;
        int times = 1;
        int set = 1;

        while (lines < 8){
            while (set <= lines) {
                while (times <= lines) {
                    System.out.print(lines);
                    times ++;
                }
                set ++;
            }
            System.out.print("\n");
            lines ++;
            times = 1;
            set = 1;
        }
    }
}
