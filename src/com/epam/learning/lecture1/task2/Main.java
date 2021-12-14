package com.epam.learning.lecture1.task2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Serhii", 18, "APO");
        System.out.println(student.getName() + " " + student.getAge() + " " + student.getGroup());
        Student student1 = new Student("Max", 19, "MPO");
        Student student2 = student1;
        System.out.println(student.equals(student1));
        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode() == student2.hashCode());

    }
}
