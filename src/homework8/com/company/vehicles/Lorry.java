package homework8.com.company.vehicles;

import homework8.com.company.details.Engine;
import homework8.com.company.professions.Driver;

public class Lorry extends Car {
    private int carrying;

    public Lorry(String carClass, String mark, Driver driver, Engine engine, int carrying) {
        super(carClass, mark, driver, engine);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carrying=" + carrying +
                "} " + super.toString();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Lorry{" +
                "carrying=" + carrying +
                "} ");
    }
}
