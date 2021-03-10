import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        isPrime(number);

    }
    public static boolean isPrime(int num) {
        String  primeNumbers = "";

        for (int i = 1; i <= num; i++) {
            int counter=0;
            for(int k =i; k>=1; k--) {
                if(i%k==0) {
                    counter = counter + 1;
                }
            }
            if (counter ==2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.print(primeNumbers);
        return true;
    }
}
