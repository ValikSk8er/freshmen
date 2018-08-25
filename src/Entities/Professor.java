package Entities;

import Enums.Gender;
import Interfaces.Teacher;

public class Professor extends AbstractPerson implements Teacher {

    private Group group;

    public Professor(String firstName, String lastName, int age, Gender gender) {
        super(firstName, lastName, age, gender);
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public void checkStudentsVisits() {
        if(group == null){
            throw new NullPointerException("group is empty");
        }

        int isPresentNumber = 0;
        int isAbsentNumber = 0;

        for(Student student : group.getStudents()){
            if(student.isPresentToday()){
                isPresentNumber++;
            }
            else{
                isAbsentNumber++;
            }
        }
        System.out.println(new StringBuilder()
                .append("Students are present today: ")
                .append(isPresentNumber)
                .append("\nStudents are absent today: ")
                .append(isAbsentNumber)
                .toString());
        System.out.println("++++++++++++++++++++");
    }

    //Перекличка
    @Override
    public void startRollCall() {
        if(group == null){
            throw new NullPointerException("group is empty");
        }
        for(Student student : group.getStudents()){
            System.out.println(new StringBuilder(student.getLastName())
                    .append(" ")
                    .append(student.getFirstName())
                    .append(" are you here?")
                    .toString());
            System.out.println(student.isPresentToday() ? " Yes" : " Is absent");
        }
        System.out.println("++++++++++++++++++++");
    }

    public void showInfo(){
        StringBuilder professorInfo = new StringBuilder();
        professorInfo
                .append("First name: ")
                .append(getFirstName())
                .append("\nLast name: ")
                .append(getLastName())
                .append("\nGender is: ")
                .append(getGender())
                .append("\nAge is: ")
                .append(getAge())
                .append("\nIs professor for group: ")
                .append(group.getGroupName());

        System.out.println(professorInfo.toString());
        System.out.println("++++++++++++++++++++");
    }
}