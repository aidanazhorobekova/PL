public class NumbersOutput60For {
    public static void main(String[] args) {
        vert();
        digits();
    }
    public static void vert() {
        for (int six = 6; six > 0; six --) {
            for (int ten = 1; ten < 10; ten ++) {
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println("");
    }
    public static void digits() {
        for (int six = 6; six > 0; six --) {
            for (int ten = 1; ten < 10; ten++) {
                System.out.print(ten);
            }
            System.out.print("0");
        }
    }
}
