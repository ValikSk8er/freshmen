package University;

import Enums.Gender;
import Interfaces.Person;

public abstract class UniversityPerson implements Person {
    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;

    public UniversityPerson(String firstName, String lastName, int age, Gender gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getGender() {
        return gender
                .name()
                .toLowerCase();
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
