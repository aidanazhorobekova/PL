import java.util.Scanner;

public class ZeroEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        System.out.println(replace(input));
    }

    public static String replace(String input) {
        String order = "";
        String others = "";
        for (int j = 0; j < input.length(); j++) {
            if (input.charAt(j) != "0".charAt(0)) {
                order = order + input.charAt(j);
            } else {
                others = others + input.charAt(j);
            }
        }

        order = order + others;
        char arr[] = order.toCharArray();
        for(char a: arr){
            System.out.print(a + " ");
        }
        return order;
    }
}
