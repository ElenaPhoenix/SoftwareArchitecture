import DIP.*;
import OCP.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(new PetrolEngine());
        car.start();
        car = new Car(new DieselEngine());
        car.start();
    

        Vehicle vehicle = new Vehicle(300, "Train");
        printVehicleMaxSpeed(vehicle);
        vehicle = new Caar(200);
        printVehicleMaxSpeed(vehicle);
        vehicle = new Bus(100);
        printVehicleMaxSpeed(vehicle);
    }

    public static void printVehicleMaxSpeed(Vehicle vehicle) {
        System.out.println(vehicle.type + " max_speed -> " + vehicle.calculateAllowedSpeed());
    }
}
