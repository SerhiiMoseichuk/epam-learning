package com.epam.learning.lecture2.regform.controller;



import com.epam.learning.lecture2.regform.view.View;

import java.util.Scanner;

public class UtilityController {
    private Scanner sc;
    private View view;

    public UtilityController(Scanner sc, View view) {
        this.sc = sc;
        this.view = view;
    }

    String inputStringValue(String message, String regex){
        String result;
        view.printStringInput(message);
        while (!(sc.hasNext() && (result = sc.next()).matches(regex))){
            view.printWrongStringInput(message);
        }
        return result;
    }
}
