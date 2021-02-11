public class NumbersOutput60 {
    public static void main(String[] args) {
        int six = 6;
        int ten = 1;

        vert(six, ten);
        digits(six, ten);
    }
    public static void vert(int six, int ten) {
        while (six > 0) {
            while (ten < 10) {
                System.out.print(" ");
                ten ++;
            }
            while(ten == 10) {
                System.out.print("|");
                break;
            }
            six --;
            ten = 1;
        }
        System.out.println("");
    }
    public static void digits(int six, int ten) {
        while (six > 0) {
            while (ten < 10) {
                System.out.print(ten);
                ten ++;
            }
            while(ten == 10) {
                System.out.print("0");
                break;
            }
            six --;
            ten = 1;
        }
    }
}
