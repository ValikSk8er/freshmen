package com.company;

import Builders.UniversityBuilder;
import Entities.University;

public class Main {

    public static void main(String[] args) {
        
        int groupsNumber = 21;
        int professorsNumber = 12;
        int studentsNumber = 86;
        
        University kpi = UniversityBuilder.getUniversity(groupsNumber, professorsNumber, studentsNumber);

        kpi.getRandomGroup()
                .chooseGroupPresident();

        kpi.getRandomProfessor()
                .checkStudentsVisits();

        kpi.getRandomProfessor()
                .startRollCall();
    }
}
