package com.epam.learning.lecture2.regform.controller;

import com.epam.learning.lecture2.regform.view.View;


import java.util.Scanner;

import static com.epam.learning.lecture2.regform.controller.RegexController.*;
import static com.epam.learning.lecture2.regform.view.TextConstant.FIRST_NAME;
import static com.epam.learning.lecture2.regform.view.TextConstant.LOGIN_DATA;


public class Note {
    private View view;
    private Scanner sc;

    private String firstName;
    private String login;

    public Note(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    public void inputNote() {
        UtilityController utilityController = new UtilityController(sc, view);
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua")) ? REGEX_NAME_UA : REGEX_NAME_LAT;

        this.firstName = utilityController.inputStringValue(FIRST_NAME, str);

        this.login = utilityController.inputStringValue(LOGIN_DATA, REGEX_LOGIN);
    }
}