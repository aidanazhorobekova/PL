package com.company;

import java.util.Scanner;

public class Desks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (1 <= a && a <= 10000) {
            int c = a;
            if (a %2 ==1) {
                c = a+1;
            }
            int b = c/2;
            while (b <= a){
                System.out.print(b+ " ");
                b++;
            }
        } else{
            System.out.println("Doesn't exist");
        }
    }
}
