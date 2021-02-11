public class SpacedNumbersFor {
    public static void main(String[] args) {
        for (int set = 1; set < 6; set ++) {
            for (int spaces = 5 - set; spaces > 0; spaces --) {
                System.out.print(" ");
            }
            System.out.print(set + "\n");
        }
    }
}
