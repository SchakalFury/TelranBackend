package homework1.task2.professions;

import java.util.Date;

public class Person extends Driver{
    String address;
    Date yearOfBirth;

    public Person(String firstName, String lastName, String middleName, int drivingExperience, String address, Date yearOfBirth) {
        super(firstName, lastName, middleName, drivingExperience);
        this.address = address;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "address='" + address + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", drivingExperience=" + drivingExperience +
                '}';
    }
}
