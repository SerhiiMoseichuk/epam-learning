package com.epam.learning.lecture1;

import java.util.Scanner;

public class MoreOrLess {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomVal = 1 + (int) (Math.random() * 100);
        int number = -1;
        int minValue = 0;
        int maxValue = 100;
        String result = "";
        do {
            System.out.print("Try to guess: ");
            number = sc.nextInt();
            if (number == 123) {
                System.out.println("You surrendered :(");
                break;
            } else {
                result += number + " ";
                if (randomVal > number) {
                    System.out.println("more...");
                    minValue = number;
                } else if (randomVal < number) {
                    System.out.println("less...");
                    maxValue = number;
                } else {
                    System.out.println("You win !!!");
                }
                System.out.println("Current range: [" + minValue + ", " + maxValue + "]");
            }
        } while (number != randomVal);
        System.out.println("Your attempts - [ " + result + "]");

    }

    int rand (int min, int max){
        return 0;
    }
}
