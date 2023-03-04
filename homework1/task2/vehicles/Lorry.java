package homework1.task2.vehicles;

import homework1.task2.details.Engine;
import homework1.task2.professions.Driver;

public class Lorry extends Car{
    int bodyLoadCapacity;

    public Lorry(String carBrand, String carClass, int weight, Driver driver, Engine engine, int bodyLoadCapacity) {
        super(carBrand, carClass, weight, driver, engine);
        this.bodyLoadCapacity = bodyLoadCapacity;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "bodyLoadCapacity=" + bodyLoadCapacity +
                ", carBrand='" + carBrand + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver.toString() +
                ", engine=" + engine +
                '}';
    }
}
