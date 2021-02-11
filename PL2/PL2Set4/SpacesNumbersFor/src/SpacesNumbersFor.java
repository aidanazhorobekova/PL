public class SpacesNumbersFor {
    public static void main(String[] args) {
        for (int set = 1; set < 6; set ++) {
            for (int spaces = 5 - set; spaces > 0; spaces --) {
                System.out.print(" ");
            }
            for (int rep = 1; rep <= set; rep ++) {
                System.out.print(set);
            }
            System.out.println("");
        }
    }
}
