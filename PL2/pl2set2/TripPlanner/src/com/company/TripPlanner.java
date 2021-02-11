package com.company;

import java.util.Scanner;

public class TripPlanner {
    public static void main(String[] args) {
//        greeting();
//        travelTimeBudget();
//        timeDifference();
        countryArea();
    }
//    public static void greeting() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Welcome to Vacation Planner!\n");
//        System.out.print("What is your name: ");
//        String name = scanner.nextLine();
//        System.out.print("Nice to meet you " + name + ", where are you traveling to? ");
//        String destination = scanner.nextLine();
//        System.out.print("Great! " + destination + " sounds like a great trip\n");
//    }
//    private static void travelTimeBudget() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(" "+"How many days are you going to spend traveling? ");
//        int days = scanner.nextInt();
//
//        System.out.println("How much money, in USD, are you planning to spend on your trip: ");
//        int cash = scanner.nextInt();
//
//        System.out.println("What is the three letter currency symbol for your travel destination? ");
//        String currency = scanner.next();
//
//        System.out.println("How many " + currency + " are there in 1 USD? ");
//        float digits = scanner.nextFloat();
//
//
//
//        int hours = days * 24;
//        int minutes = hours * 60;
//        int seconds = minutes * 60;
//        double daily = (double)cash / (double)days;
//        float own = cash * digits;
//        double money = own / days - 0.01;
//
//
//        System.out.println(" ");
//        System.out.println("If you are traveling for " + days + " days that is same as " + hours +" hours or " + minutes + " minutes or " + seconds + " seconds.\n" +
//                "If you are going to spend $" + cash + " USD that means per day you can spend up to $ " + String.format("%.2f", daily) + " USD\n" +
//                "Your total budget in " + currency + " is " + own + " " + currency + ", which per day is " + String.format("%.2f", money) + " " + currency);
//        System.out.println("***********");
//    }
//    public static void timeDifference() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is the time difference, in hours, between your home and your destination? ");
//        int diff = scanner.nextInt();
//        int noon = 0;
//        if (diff < 0) {
//            diff = 24 + diff;
//        }
//        if (diff >= 12) {
//            noon = diff - 12;
//        } else {
//            noon = diff + 12;
//        }
//
//
//        System.out.println("That means that when it is midnight at home it will be " + diff + ":00 in your travel destination and when it's noon at home it will be " + noon + ":00\n" +
//                "***********");
//    }
    public static void countryArea() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is square area of your destination country in km2? ");
        int km = scanner.nextInt();
        double miles = km * 0.38610215854245;

        System.out.println("In miles2 that is " + String.format("%.2f", miles) + "\n" +
                "***********");
    }
}