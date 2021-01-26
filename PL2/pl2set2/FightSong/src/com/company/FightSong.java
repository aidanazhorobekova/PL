package com.company;

public class FightSong {
    public static void main(String[] args) {
        chorus();
        verse();
        verse();
        chorus();
    }
    public static void chorus() {
        System.out.println("Go, team, go!\n" +
                "You can do it.\n");
    }
    public static void verse(){
        System.out.println("Go, team, go!\n" +
                "You can do it.\n" +
                "You're the best,\n" +
                "In the West.\n" +
                "Go, team, go!\n" +
                "You can do it.\n");
    }
}