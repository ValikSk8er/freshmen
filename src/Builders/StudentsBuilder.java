package Builders;

import Entities.Student;
import Utils.InfoGenerator;

public class StudentsBuilder {
    private static InfoGenerator info = new InfoGenerator();
    private Student[] students;

    private StudentsBuilder(int studentsNumber){
        students = new Student[studentsNumber];

        for (int i=0; i< studentsNumber; i++){
            students[i] = new Student(info.getFirstName(), info.getLastName(), info.getAge(), info.getGenderState());
        }
    }

    public static Student[] getStudents(int studentsNumber){

        if(studentsNumber < 1){
            throw new IllegalArgumentException("You enter an invalid value: " + studentsNumber);
        }

        return new StudentsBuilder(studentsNumber).students;
    }
}
