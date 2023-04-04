package Builders.components;

import Builders.components.TripComputer;

public class Engine {
    private double volume;
    private double mileage;
    private boolean started;
    private TripComputer tripComputer;
    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    public void on() {
        started = true;
    }
    public void off() {
        started = false;
    }

    public boolean isStarted() {
        return started;
    }

    public void go(double mileage) {
        if (isStarted()) {
            this.mileage += mileage;
            tripComputer.addTotalTrip(mileage);
        } else {
            System.out.println("You must start engine first!");
        }
    }

    public double getVolume() {
        return volume;
    }

    public double getMileage() {
        return mileage;
    }
}
