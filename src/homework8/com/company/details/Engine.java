package homework8.com.company.details;

import java.util.Objects;

public class Engine {
    private int power;
    private String manufact;

    public Engine(int power, String manufact) {
        this.power = power;
        this.manufact = manufact;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getManufact() {
        return manufact;
    }

    public void setManufact(String manufact) {
        this.manufact = manufact;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", manufact='" + manufact + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Engine)) return false;
        Engine engine = (Engine) o;
        return power == engine.power &&
                Objects.equals(manufact, engine.manufact);
    }

    @Override
    public int hashCode() {
        return Objects.hash(power, manufact);
    }

}
