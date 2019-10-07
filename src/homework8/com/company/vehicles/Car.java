package homework8.com.company.vehicles;


import homework8.com.company.details.Engine;
import homework8.com.company.professions.Driver;

public class Car {
    private String carClass;
    private String mark;
    private Driver driver;
    private Engine engine;

    public Car(String carClass, String mark, Driver driver, Engine engine) {
        this.carClass = carClass;
        this.mark = mark;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public void printInfo() {
        System.out.println("{" +
                "carClass='" + carClass + '\'' +
                ", mark='" + mark + '\'' +
                ", driver=" + driver +
                ", engine=" + engine
        );
    }

    @Override
    public String toString() {
        return "Car{" +
                "carClass='" + carClass + '\'' +
                ", mark='" + mark + '\'' +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }

    public static void main(String[] args) {
        Engine engine = new Engine(250, "Tesla");
        Driver driver = new Driver("Ivanov Ivan", 25, 4);
        Car car = new SportCar("Легковой", "Model S", driver, engine,300);
        car.printInfo();
    }

}
