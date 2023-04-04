package Builders.director;

import Builders.builders.Builder;
import Builders.cars.CarTypes;
import Builders.components.Engine;
import Builders.components.GPSController;
import Builders.components.Transmission;
import Builders.components.TripComputer;

public class Director {
    public void createSportsCar(Builder builder) {
        builder.setCarType(CarTypes.SPORTS_CAR);
        builder.setEngine(new Engine(3.0, 0));
        builder.setSeats(2);
        builder.setTripComputer(new TripComputer());
        builder.setGPSController(new GPSController());
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
    }

    public void createSUVCar(Builder builder) {
        builder.setCarType(CarTypes.SUV);
        builder.setEngine(new Engine(5.0, 0));
        builder.setSeats(4);
        builder.setTripComputer(new TripComputer());
        builder.setGPSController(new GPSController());
        builder.setTransmission(Transmission.MANUAL);
    }

    public void createSportsCarWithUsedEngine(Builder builder) {
        builder.setCarType(CarTypes.SPORTS_CAR);
        builder.setEngine(new Engine(3.0, 52005));
        builder.setSeats(2);
        builder.setTripComputer(new TripComputer());
        builder.setGPSController(new GPSController());
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
    }
}
