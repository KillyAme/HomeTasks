package homework9;

import java.util.Objects;

public class Horse extends Animal {
    private int carrying;
    private boolean ride;

    public Horse(String food, String location, int carrying, boolean ride) {
        super(food, location);
        this.carrying = carrying;
        this.ride = ride;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    public boolean isRide() {
        return ride;
    }

    public void setRide(boolean ride) {
        this.ride = ride;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "carrying=" + carrying +
                ", ride=" + ride +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Horse)) return false;
        if (!super.equals(o)) return false;
        Horse horse = (Horse) o;
        return carrying == horse.carrying &&
                ride == horse.ride;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), carrying, ride);
    }

    @Override
    public void makeNoise() {
        System.out.println("Эта лошадь спит. ");
    }

    @Override
    public void eat() {
        System.out.println("Эта лошадь ест. ");
    }
}
