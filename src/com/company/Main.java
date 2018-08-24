package com.company;

import Builders.UniversityBuilder;
import Entities.University;

public class Main {

    public static void main(String[] args) {

        University kpi = UniversityBuilder.getUniversity(4, 5, 21);

        kpi.getRandomGroup()
                .chooseGroupPresident();

        kpi.getRandomProfessor()
                .checkStudentsVisits();

        kpi.getRandomProfessor()
                .startRollCall();
    }
}