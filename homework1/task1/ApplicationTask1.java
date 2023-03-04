package homework1.task1;

import homework1.task1.Aspirant;
import homework1.task1.Student;

public class ApplicationTask1 {

    public static void main(String[] args) {
        Student students[] = {new Student("Michael", " Boyd", 224, 3),
                new Student("Donald", " Davidson", 224, 5),
                new Student("Christopher", "Sanders", 224, 6),
                new Student("Michael", " Drake", 224, 4),
                new Aspirant("Victor", "Lopez", 224, 5, "some scientific work 1"),
                new Aspirant("William", "Miller", 224, 0, "some scientific work 2"),
                new Aspirant("Joshua", "Berry", 224, 3, "some scientific work 3")};

        for (Student student : students){
            System.out.println(student.getScholarship());
        }
    }


}
