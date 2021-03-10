import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a binary number: ");

        String binary = scanner.nextLine();

        int decimal = 0;

        for (int i = 0; i < binary.length(); i ++) {
            decimal = decimal * 2;
            if (binary.charAt(i) == "1".charAt(0)) {
                decimal = decimal + 1;

            }
        }
        System.out.println("Decimal of " + binary + " is " + decimal);
    }
}
