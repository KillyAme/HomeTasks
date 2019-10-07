package homework9;

import java.util.Objects;

public class Dog extends Animal {
    private String intended, size;

    public Dog(String food, String location, String intended, String size) {
        super(food, location);
        this.intended = intended;
        this.size = size;
    }

    public String getIntended() {
        return intended;
    }

    public void setIntended(String intended) {
        this.intended = intended;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(intended, dog.intended) &&
                Objects.equals(size, dog.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), intended, size);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "intended='" + intended + '\'' +
                ", size='" + size + '\'' +
                "} " + super.toString();
    }

    @Override
    public void makeNoise() {
        System.out.println("Эта собака спит. ");
    }

    @Override
    public void eat() {
        System.out.println("Эта собака ест. ");
    }
}
