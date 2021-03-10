import java.util.Scanner;

public class ZeroFront {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(replace(input));
    }

    public static String replace(String input) {
        String order = "";
        String others = "";
        for (int j = 0; j < input.length(); j++) {
            if (input.charAt(j) == "0".charAt(0)) {
                order = order + " 0";
            } else {
                others = others + input.charAt(j);
            }
        }

        order = order + others;
//        for (int k = 0; k <= others.length(); k++) {
//            order = order + ;
//        }
        return order;
    }
}
