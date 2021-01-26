package com.company;


public class Lanterns {
    public static void main(String[] args) {
        roof();
        System.out.println(" ");
        roof();
        vert();
        stars();
        roof();
        System.out.println(" ");
        roof();
        line();
        vert();
        vert();
        line();
        line();
    }
    public static void roof() {
        System.out.println("    *****\n" +
                "  *********\n" +
                "*************");
    }
    public static void vert() {
        System.out.print("* | | | | | *\n");
    }
    public static void stars() {
        System.out.print("*************\n");
    }
    public static void line() {
        System.out.print("    *****\n");
    }
}
