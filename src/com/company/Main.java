package com.company;

import Enums.Gender;
import University.Group;
import University.Professor;
import University.Student;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student valek = new Student("Valek", "Skater", 31, Gender.MALE);
        Student alex = new Student("Alex", "Mackedonskiy", 30, Gender.MALE);
        Student elena = new Student("Elena", "Origin", 25, Gender.FEMALE);
        Student julia = new Student("Julia", "Trubet", 26, Gender.FEMALE);
        Student irina = new Student("Irina", "Mansola", 27, Gender.FEMALE);
        Student igor = new Student("Igor", "Biskit", 24, Gender.MALE);
        Student bohdan = new Student("Bohdan", "Chmelnytskyi", 26, Gender.MALE);

        List<Student> students = Arrays.asList(valek, alex, elena, julia, irina, igor, bohdan);

        Professor professorEvgen = new Professor("Evgen", "Oleksiyovych", 44, Gender.MALE);

        Group javaGroup = new Group("JavaCource-18", students);
        javaGroup.chooseGroupPresident();

        professorEvgen.setGroup(javaGroup);
        professorEvgen.showInfo();
        professorEvgen.checkStudentsVisits();
        professorEvgen.startRollCall();
    }
}