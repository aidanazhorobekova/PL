import java.util.Scanner;

public class GoodTimeOfTheDay {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int time = scn.nextInt();

        if (time < 10 && time > 5 ){
            System.out.println("Good morning!");
        } else if (time <= 5 && time >= 0 ){
            System.out.println("Good night!");
        } else if (time <= 24 && time >= 20 ){
            System.out.println("Good evening!");
        } else if (time < 20 && time >= 10 ){
            System.out.println("Good day!");
        } else{
            System.out.println("Not acceptable time.");
        }
    }
}