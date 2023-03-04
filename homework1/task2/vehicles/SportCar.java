package homework1.task2.vehicles;

import homework1.task2.details.Engine;
import homework1.task2.professions.Driver;

public class SportCar extends Car{

    int topSpeed;

    public SportCar(String carBrand, String carClass, int weight, Driver driver, Engine engine, int topSpeed) {
        super(carBrand, carClass, weight, driver, engine);
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "topSpeed=" + topSpeed +
                ", carBrand='" + carBrand + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver.toString() +
                ", engine=" + engine.toString() +
                '}';
    }
}
