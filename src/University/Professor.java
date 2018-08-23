package University;

import Entities.Gender;
import Entities.UniversityPerson;

public class Professor extends UniversityPerson {
    public Professor(String firstName, String lastName, int age, Gender gender) {
        super(firstName, lastName, age, gender);
    }
}
