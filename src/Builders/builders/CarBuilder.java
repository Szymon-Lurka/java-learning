package Builders.builders;

import Builders.cars.Car;
import Builders.cars.CarTypes;
import Builders.components.Engine;
import Builders.components.GPSController;
import Builders.components.Transmission;
import Builders.components.TripComputer;

public class CarBuilder implements Builder {
    private CarTypes type;
    private Engine engine;
    private int seats;
    private Transmission transmission;
    private GPSController gpsController;
    private TripComputer tripComputer;

    @Override
    public void setCarType(CarTypes type) {
        this.type = type;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setGPSController(GPSController gpsController) {
        this.gpsController = gpsController;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    public Car getResult() {
        return new Car(type, engine, transmission, tripComputer, gpsController, seats);
    }
}
