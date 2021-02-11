public class NestedNumbers {
    public static void main(String[] args) {
        int times = 3;
        int lines = 3;
        int set = 0;

        while (lines > 0) {
            while (set < 10) {
                while (times > 0) {
                    System.out.print(set);
                    times --;
                }
                set ++;
                times = 3;
            }
            System.out.print("\n");
            lines --;
            set = 0;
        }
    }
}
