package com.epam.learning.lecture2.task1;

public class NoteBook {
    private String surname;
    private String nickname;


    public NoteBook(String surname, String nickname) {
        this.surname = surname;
        this.nickname = nickname;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
