package Entities;

import Utils.Randomiser;

public class University {
    private Group[] groups;
    private Professor[] professors;
    private Student[] students;

    public University(Group[] groups, Professor[] professors, Student[] students){
        this.groups = groups;
        this.professors = professors;
        this.students = students;

        for(Professor professor : professors){
            professor.setGroup(getRandomGroup());
        }
    }

    public Group getRandomGroup(){
        return groups[Randomiser.getNumberByBound(groups.length)];
    }

    public Professor getRandomProfessor(){
        return professors[Randomiser.getNumberByBound(professors.length)];
    }
}
