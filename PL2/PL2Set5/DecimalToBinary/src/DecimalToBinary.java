import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer number: ");

        int decimal = scanner.nextInt();
        int dec = decimal;
        String binary = "";

        while (decimal > 0) {
            int remainder = decimal % 2;

            if (remainder == 1) {
                binary = binary + "1";
                decimal --;
            } else {
                binary = binary + "0";
            }
            decimal = decimal / 2;
        }

        if (binary.length() < 8) {
            for (int i = 8 - binary.length(); i > 0; i --) {
                binary = binary + "0";
            }
        }

        String reverse = "";
        for (int k = binary.length() - 1; k >= 0; k --) {
            reverse = reverse + binary.charAt(k);
        }
        System.out.println("Binary of " + dec + " is " + reverse);
    }
}
