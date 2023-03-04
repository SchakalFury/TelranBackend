package homework1.task2.professions;

public class Driver {
    String firstName;
    String lastName;
    String middleName;
    int drivingExperience;

    public Driver(String firstName, String lastName, String middleName, int drivingExperience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.drivingExperience = drivingExperience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", drivingExperience=" + drivingExperience +
                '}';
    }
}
