package OCP;

public class Caar extends Vehicle {
    public Caar(int maxspeed) {
        super(maxspeed, "Car");
    }

    @Override
    public double calculateAllowedSpeed() {
        return super.maxspeed *0.8;
    }
}
