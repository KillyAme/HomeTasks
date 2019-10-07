package homework8.com.company.vehicles;

import homework8.com.company.details.Engine;
import homework8.com.company.professions.Driver;

public class SportCar extends Car {
    private double speed;

    public SportCar(String carClass, String mark, Driver driver, Engine engine, double speed) {
        super(carClass, mark, driver, engine);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "speed=" + speed +
                "} " + super.toString();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("SportCar{" +
                "speed=" + speed +
                "} ");
    }
}
