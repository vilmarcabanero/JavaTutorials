package org.example;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        if( day == 1) {
            System.out.println("IF: Today is Monday.");
        } else if (day == 2) {
            System.out.println("IF: Today is Tuesday.");
        } else if (day == 3) {
            System.out.println("IF: Today is Wednesday.");
        } else if (day == 4) {
            System.out.println("IF: Today is Thursday.");
        } else if (day == 5) {
            System.out.println("IF: Today is Friday.");
        } else if (day == 6) {
            System.out.println("IF: Today is Saturday.");
        } else if (day == 7) {
            System.out.println("IF: Today is Sunday.");
        } else {
            System.out.println("IF: Invalid day");
        }

        switch (day) {
            case 1 -> System.out.println("SWITCH: Today is Monday.");
            case 2 -> System.out.println("SWITCH: Today is Tuesday.");
            case 3 -> System.out.println("SWITCH: Today is Wednesday.");
            case 4 -> System.out.println("SWITCH: Today is Thursday.");
            case 5 -> System.out.println("SWITCH: Today is Friday.");
            case 6 -> System.out.println("SWITCH: Today is Saturday.");
            case 7 -> System.out.println("SWITCH: Today is Sunday.");
            default -> System.out.println("SWITCH: Invalid day");
        }
        
    }
}
