import java.util.Scanner;

public class PaperScissorsRock {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String p1 = scn.nextLine();
        String p2 = scn.nextLine();


        if (p1.equals(p2)) {
            System.out.println("Draw");
        } else if (p1.equals("pp") && p2.equals("rc")){
            System.out.println("Winner is Player1");
        } else if (p1.equals("rc") && p2.equals("sc")){
            System.out.println("Winner is Player1");
        } else if (p1.equals("sc") && p2.equals("pp")){
            System.out.println("Winner is Player1");
        } else {
            System.out.println("Winner is Player2");
        }
    }
}
