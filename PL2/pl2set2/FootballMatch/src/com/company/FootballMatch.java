package com.company;

import java.util.Scanner;

public class FootballMatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int c = 0;
        while (a > 0) {
            for (int b = 1; b <= a; b++) {
                a = a - b;
                c = c + 1;
            }
        }
        System.out.println(c);
    }
}
