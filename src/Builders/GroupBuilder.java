package Builders;

import Entities.Group;
import Entities.Student;
import Utils.InfoGenerator;
import Utils.Randomiser;

public class GroupBuilder {
    private Group[] groups;

    private GroupBuilder(int groupsNumber, Student[] students){
        groups = new Group[groupsNumber];

        for (int i=0; i< groupsNumber; i++){
            groups[i] = new Group(InfoGenerator.getWord(), getStudentForGroup(students));
        }
    }

    public static Group[] getGroups(int groupsNumber, Student[] students){
        if(groupsNumber < 1 || students == null){
            throw new IllegalArgumentException("You enter an invalid value: " + groupsNumber);
        }

        return new GroupBuilder(groupsNumber, students).groups;
    }

    private static Student[] getStudentForGroup(Student[] students){
        int groupSize = Randomiser.getNumberByRange(1, students.length);
        Student[] studentsForCurrentGroup = new Student[groupSize];

        for(int i = 0; i < groupSize; i++){
            studentsForCurrentGroup[i] = students[Randomiser.getNumberByBound(students.length)];
        }

        return studentsForCurrentGroup;
    }
}
