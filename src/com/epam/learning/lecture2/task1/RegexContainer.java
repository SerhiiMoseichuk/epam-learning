package com.epam.learning.lecture2.task1;

public interface RegexContainer {
    String REGEX_SURNAME_LAT = "^[A-Z][a-z]{1,20}$";
    String REGEX_SURNAME_UA = "[А-ЩЬЮЯЄЇІ][а-щьюяєїі']{1,19}[а-щьюяєїі]$";
    String REGEX_NICKNAME = "^[A-Za-z0-9_-]{8,20}$";
}
