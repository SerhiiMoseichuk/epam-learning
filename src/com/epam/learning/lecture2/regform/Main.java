package com.epam.learning.lecture2.regform;


import com.epam.learning.lecture2.regform.controller.Controller;
import com.epam.learning.lecture2.regform.model.Model;
import com.epam.learning.lecture2.regform.view.View;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());
        controller.processUser();
    }
}
