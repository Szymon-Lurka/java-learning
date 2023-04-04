package Builders.cars;

import Builders.components.Engine;
import Builders.components.GPSController;
import Builders.components.Transmission;
import Builders.components.TripComputer;

public class Car {
    private final CarTypes carType;
    private Engine engine;
    private final int seats;
    private final Transmission transmission;

    private final GPSController gpsController;
    private final TripComputer tripComputer;
    private double fuel = 0;

    private final double FUEL_PER_100_MILES = 7;


    public Car(CarTypes type,
               Engine engine,
               Transmission transmission,
               TripComputer tripComputer,
               GPSController gpsController,
               int seats) {
        this.carType = type;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        if (this.tripComputer != null) {
            this.tripComputer.setCar(this);
            this.engine.setTripComputer(this.tripComputer);
        }
        this.gpsController = gpsController;
        this.seats = seats;
    }

    double howManyMilesCanGo() {
        return (fuel / FUEL_PER_100_MILES) * 100;
    }

    double howManyFuelNeed(double mileage) {
        return (mileage / 100) * FUEL_PER_100_MILES;
    }

    public void addFuel(double fuel) {
        this.fuel += fuel;
    }

    public CarTypes getCarType() {
        return carType;
    }

    public double getFuel() {
        return fuel;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPSController getGpsController() {
        return gpsController;
    }

    public void changeEngine(Engine engine) {
        this.engine = engine;
        this.engine.setTripComputer(this.tripComputer);
    }

    public void go(double mileage) {
        if (mileage > howManyMilesCanGo()) {
            System.out.println("You don't have enough fuel!");
            System.out.println("You missing " + howManyFuelNeed(mileage) + " liters");
        } else {
            engine.on();
            engine.go(mileage);
            this.fuel -= howManyFuelNeed(mileage);
            engine.off();
        }
    }
}
