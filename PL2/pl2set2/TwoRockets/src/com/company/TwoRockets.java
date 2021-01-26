package com.company;

public class TwoRockets {
    public static void main(String[] args) {
        roof();
        windows();
        words();
        windows();
        roof();
    }
    public static void roof(){
        System.out.println("   /\\       /\\\n" +
                "  /  \\     /  \\\n" +
                " /    \\   /    \\");
    }
    public static void windows() {
        System.out.println("+------+ +------+\n" +
                "|      | |      |\n" +
                "|      | |      |\n" +
                "+------+ +------+");
    }
    public static void words(){
        System.out.println("|  KG  | |  KG  |\n" +
                "|Soonun| |Soonun|");
    }
}
