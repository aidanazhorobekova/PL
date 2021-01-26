package com.company;

public class StarFigures {
    public static void main(String[] args) {
        line();
        cross();
        empty();
        line();
        cross();
        line();
        empty();
        vertic();
        line();
        cross();
    }
    public static void line() {
        System.out.println("*****\n" +
                "*****");
    }
    public static void cross() {
        System.out.println(" * *\n" +
                "  *\n" +
                " * *");
    }
    public static void empty() {
        System.out.println(" ");
    }
    public static void vertic() {
        System.out.println("  *\n" +
                "  *\n" +
                "  *");
    }
}