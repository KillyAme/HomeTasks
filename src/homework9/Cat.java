package homework9;

import java.util.Objects;

public class Cat extends Animal {
    private String breed, name;

    public Cat(String food, String location, String breed, String name) {
        super(food, location);
        this.breed = breed;
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(breed, cat.breed) &&
                Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), breed, name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Кот " + name + " породы " + breed + " сейчас спит ");
    }

    @Override
    public void eat() {
        System.out.println("Кот " + name + " породы " + breed + " сейчас ест ");

    }
}
