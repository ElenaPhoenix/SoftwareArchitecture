package Homework.Types;

import java.awt.Color;
import Homework.Car;
import Homework.Fueling.FuelType;

public class FlyCar extends Car { // летающий авто

    public FlyCar(String make, String model, Color color, FuelType fuelType) {
        super(make, model, color, fuelType);
        setWheelsCount(4);
    }

    public void fly() { // Метод полёта авто
        System.out.println("Автомобиль летит!");
    }

    @Override
    public void movement() {
        fly();
    }

    @Override
    public void maintenance() {
    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadLights() {
        return false;
    }

    @Override
    public boolean swithWipers() {
        return false;
    }
}
