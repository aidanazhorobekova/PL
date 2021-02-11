import java.util.Scanner;

public class SplitSentence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the single line text please: ");
        String sentence = scn.next();

        splitSentence2Words(sentence);
    }
    public static void splitSentence2Words(String sentence) {
        String snt = sentence.replaceAll("[^a-zA-Z0-9 ]", "");
        System.out.println(snt.replace(" ", "\n"));
    }
}
