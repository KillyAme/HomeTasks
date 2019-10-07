package homework8.com.company.professions;

import homework6.Person;

import java.util.Objects;

public class Driver extends Person {
    private int driveExp;

    public Driver(String fullName, int age, int driveExp) {
        super(fullName, age);
        this.driveExp = driveExp;
    }

    public Driver(int driveExp) {
        this.driveExp = driveExp;
    }

    public int getDriveExp() {
        return driveExp;
    }

    public void setDriveExp(int driveExp) {
        this.driveExp = driveExp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        Driver driver = (Driver) o;
        return driveExp == driver.driveExp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(driveExp);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driveExp=" + driveExp +
                "} " + super.toString();
    }
}
