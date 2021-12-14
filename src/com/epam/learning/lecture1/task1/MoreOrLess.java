package com.epam.learning.lecture1.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MoreOrLess {

//    int rand (int min, int max){
//        int value = 1 + (int) (Math.random() * (max - min));
//        return value;
//    }

    public static void main(String[] args) {

        int randomVal = 1 + (int) (Math.random() * 100);

        int number = -1;
        int minValue = 0;
        int maxValue = 100;
        String result = "";

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Try to guess: ");
            try { // перевірка на введення "не числа"
                number = sc.nextInt();
            } catch (InputMismatchException ex) {
                throw new InputMismatchException("Input NaN");
            }
            if (number > 100 || number < 0) throw new NumberFormatException("Out of range [0,100]"); // перевірка відповідності введеного числа діапазону

            if (number == 123) {  // вихід з програми при введені "123"
                System.out.println("You surrendered :(");
                break;
            } else {
                result += number + " "; // запис спроб користувача
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
        sc.close();
    }


}
