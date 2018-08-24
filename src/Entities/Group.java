package Entities;

import Utils.Randomiser;

import java.util.List;

public class Group {

    private String groupName;
    private int groupSize;
    private Student[] students;
    private Student groupPresident;

    public String getGroupName() {
        return groupName;
    }

    public Student[] getStudents() {
        return students;
    }

    public Student getStudentByName(String studentName){
        for (Student student : students) {
            if(student.getFirstName().equals(studentName)
                    || student.getLastName().equals(studentName)){
                return student;
            }
        }
        return null;
    }

    public Group(String groupName, Student[] students){
        this.groupName = groupName;
        this.students = students;
        this.groupSize = students.length;
    }

    public void chooseGroupPresident(){
        if(students == null || groupSize == 0){
            throw new NullPointerException("students list is empty");
        }
        groupPresident = students[0];
        for (Student student : students) {
            if(student.getKnowladgeEstimation() > groupPresident.getKnowladgeEstimation()){
                groupPresident = student;
            }
        }
        showGroupPresident();
    }

    public void showGroupPresident(){
        if(groupPresident == null){
            throw new NullPointerException("Group president is not chosen");
        }
        System.out.println(new StringBuilder()
                .append("Group's ")
                .append(groupName)
                .append(" president is:"));
        groupPresident.showInfo();
    }
}
