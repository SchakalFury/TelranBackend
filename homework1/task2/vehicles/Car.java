package homework1.task2.vehicles;

import homework1.task2.details.Engine;
import homework1.task2.professions.Driver;

public class Car {
    String carBrand;
    String carClass;
    int weight;
    Driver driver;
    Engine engine;

    public Car(String carBrand, String carClass, int weight, Driver driver, Engine engine) {
        this.carBrand = carBrand;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public static void start(){
        System.out.println("Let's go");
    }

    public static void stop(){
        System.out.println("Stop");
    }
    public static void turnRight(){
        System.out.println("Turn right");
    }
    public static void turnLeft(){
        System.out.println("Turn left");
    }

    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver.toString() +
                ", engine=" + engine.toString() +
                '}';
    }
}
