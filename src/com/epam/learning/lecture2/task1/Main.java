package com.epam.learning.lecture2.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main implements RegexContainer{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter new note? [Y/N]");

        if (sc.hasNext("Y"))
            System.out.println("Enter surname: ");
            String x = sc.nextLine();
            String name = sc.nextLine();
            if (name.matches(REGEX_SURNAME_LAT) || name.matches(REGEX_SURNAME_UA)) {} else {
                System.out.println("Wrong surname!");
            }

            System.out.println("Enter nickname: ");
            String nick = sc.nextLine();
            if (nick.matches(REGEX_NICKNAME)) {} else {
                System.out.println("Wrong nickname!");
            }

        NoteBook note1 = new NoteBook(name,nick);
        System.out.println(note1.getNickname() + " " + note1.getSurname());

    }
}
