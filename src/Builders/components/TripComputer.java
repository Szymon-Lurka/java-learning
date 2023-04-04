package Builders.components;

import Builders.cars.Car;

public class TripComputer {

    private Car car;
    private double totalMileage = 0;

    public void setCar(Car car) {
        this.car = car;
    }

    public void addTotalTrip(double mileage) {
        this.totalMileage += mileage;
    }

    public double getTotalMileage() {
        return totalMileage;
    }

    public void changeCar(Car car) {
        this.car = car;
        this.totalMileage = 0;
    }
}
