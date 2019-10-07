package homework10;

public class Circle {
    private double radius;
    public static final double PI = 3.14159265359;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return PI * PI * radius;
    }

    public double circumference() {
        return 2 * radius * PI;
    }

    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3);
        circles[1] = new Circle(6);
        circles[2] = new Circle(10);
        for (Circle circle : circles) {
            System.out.println("Длинна окружности с радиусом " + circle.radius + " равна " + circle.circumference() +
                    ", а площадь " + circle.area());
        }
    }
}
