package homework1.task2;

import homework1.task2.details.Engine;
import homework1.task2.professions.Driver;
import homework1.task2.vehicles.Car;

public class ApplicationTask2 {
    public static void main(String[] args) {
        Driver driver = new Driver("FirstName", "Lastname", "Middlename", 12);
        Engine engine = new Engine(220, "Mithsubishi");
        Car car = new Car("VW", "universal", 1300, driver, engine);
        System.out.println(car.toString());
    }
}
