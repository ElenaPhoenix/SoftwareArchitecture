package Homework;
import java.awt.Color;

import Homework.Fueling.*;
import Homework.Types.Harvester;
import Homework.Washing.CarWash;

public class Main {

    public static void main(String[] args) {
        Harvester maz = new Harvester("МАЗ", "5340", Color.BLUE, FuelType.Diesel);
        SportCar sportCar = new SportCar("Morgan", "Super 3", Color.GREEN, FuelType.Gasoline);

        RefuelingStation refuelingStation = new RefuelingStation();
        CarWash carWash = new CarWash();

        maz.setRefuelingStation(refuelingStation);
        maz.fuel();
        maz.setWiping(carWash);
        maz.wipMirrors();

        sportCar.setRefuelingStation(refuelingStation);
        sportCar.fuel();
        sportCar.setWiping(carWash);
        sportCar.wipHeadLights();
        sportCar.wipWindshield();
    }

}
