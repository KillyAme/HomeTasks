package homework9;

import java.util.Objects;

public class Animal {
    private String food, location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return Objects.equals(food, animal.food) &&
                Objects.equals(location, animal.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(food, location);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
    public void makeNoise(){
        System.out.println("Такое-то животное спит ");
    }
    public void eat(){
        System.out.println("Такое-то животное ест ");
    }
}
