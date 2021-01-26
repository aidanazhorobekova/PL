package com.company;

public class Egg2 {
    public static void main(String[] args) {
        head();
        middle();
        foot();
        head();
        middle();
        foot();
        middle();
        head();
        foot();
        middle();
    }
    public static void head(){
        System.out.println("  _______\n" +
                " /       \\\n" +
                "/         \\");
    }
    public static void middle() {
        System.out.println("\\         /\n" +
                " \\_______/");
    }
    public static void foot() {
        System.out.println("-\"-'-\"-'-\"-");
    }
}