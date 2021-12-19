package com.epam.learning.lecture2.regform.controller;

public interface RegexController {
    // Cyrillic name
    String REGEX_NAME_UA = "^[А-ЩЬЮЯІЇЄ][а-щьюяіїє']{1,20}$";
    // Latin name
    String REGEX_NAME_LAT = "^[A-Z][a-z]{1,20}$";
    // login
    String REGEX_LOGIN = "^[A-Za-z0-9_-]{8,20}$";
}
