package Builders;

import Entities.Student;
import Entities.University;

public class UniversityBuilder {
    public static University getUniversity(int groupsNumber, int professorsNumbers, int studentsNumber){

        Student[] students = StudentsBuilder.getStudents(studentsNumber);

        return new University(GroupBuilder.getGroups(groupsNumber, students),
                ProfessorBuilder.getProfessors(professorsNumbers),
                students);
    }
}
