package com.epam.learning.lecture2.regform.controller;


import com.epam.learning.lecture2.regform.model.Model;
import com.epam.learning.lecture2.regform.view.View;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser(){
        Scanner sc = new Scanner(System.in);
        Note note = new Note(view, sc);
        note.inputNote();
    }
}
