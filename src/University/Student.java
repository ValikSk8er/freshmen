package University;

import Entities.Gender;
import Entities.PresentState;
import Entities.UniversityPerson;
import Interfaces.Learner;
import java.util.Random;

public class Student extends UniversityPerson implements Learner {
    private int knowladgeEstimation;

    public Student(String firstName, String lastName, int age, Gender gender) {
        super(firstName, lastName, age, gender);

        knowladgeEstimation = new Random()
                .nextInt(100);
    }

    public int getKnowladgeEstimation() {
        return knowladgeEstimation;
    }

    @Override
    public String isPresentToday() {
        return (new Random()
                .nextBoolean()
                ? PresentState.PRESENT
                : PresentState.ABSENT)
                .name()
                .toLowerCase();
    }

    @Override
    public void showInfo() {
        StringBuilder studentInfo = new StringBuilder();
        studentInfo
                .append("First name: ")
                .append(getFirstName())
                .append("\n")
                .append("Last name: ")
                .append(getLastName())
                .append("\n")
                .append("Gender is: ")
                .append(getGender())
                .append("\n")
                .append("Age is: ")
                .append(getAge())
                .append("Knowladge estimation: ")
                .append(getKnowladgeEstimation());

        System.out.println(studentInfo.toString());
    }
}
