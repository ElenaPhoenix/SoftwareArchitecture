package OCP;

public class Vehicle {
    public int maxspeed;
    public String type;

    public Vehicle(int maxspeed, String type) {
        this.maxspeed = maxspeed;
        this.type = type;
    }

    public double calculateAllowedSpeed() {
        return maxspeed;
    }
}
