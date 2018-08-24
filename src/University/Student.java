package University;

import Enums.Gender;
import Interfaces.Learner;
import java.util.Random;

public class Student extends UniversityPerson implements Learner {

    public Student(String firstName, String lastName, int age, Gender gender) {
        super(firstName, lastName, age, gender);

        knowladgeEstimation = new Random().nextInt(100);
    }
    private int knowladgeEstimation;

    public int getKnowladgeEstimation() {
        return knowladgeEstimation;
    }

    @Override
    public boolean isPresentToday() {
        return new Random().nextBoolean();
    }

    @Override
    public void showInfo() {
        StringBuilder studentInfo = new StringBuilder();
        studentInfo
                .append("First name: ")
                .append(getFirstName())
                .append("\nLast name: ")
                .append(getLastName())
                .append("\nGender is: ")
                .append(getGender())
                .append("\nAge is: ")
                .append(getAge())
                .append("\nKnowladge estimation: ")
                .append(getKnowladgeEstimation());

        System.out.println(studentInfo.toString());
    }
}
