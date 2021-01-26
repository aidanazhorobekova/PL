package com.company;

import java.util.Scanner;

public class PrevAndSucc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a < 10000 && a > -10000) {
            int b = a + 1;
            System.out.printf("The next number for the number %d is %d.\n", a, b);
            int c = a - 1;
            System.out.printf("The previous number for the number %d is %d.", a, c);
        } else{
            System.out.println("Doesn't exist!");
        }
    }
}