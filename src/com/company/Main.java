package com.company;

import Entities.Gender;
import University.Student;

public class Main {

    public static void main(String[] args) {
        Student valek = new Student("valek", "cheresh", 31, Gender.MALE);
        valek.showInfo();
    }
}
