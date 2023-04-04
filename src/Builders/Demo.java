package Builders;

import Builders.builders.CarBuilder;
import Builders.cars.Car;
import Builders.director.Director;

public class Demo {
    public static void main(String[] args) {
        CarBuilder carBuilder1 = new CarBuilder();
        CarBuilder carBuilder2 = new CarBuilder();
        CarBuilder carBuilder3 = new CarBuilder();
        Director director = new Director();

        director.createSportsCar(carBuilder1);
        director.createSUVCar(carBuilder2);
        director.createSportsCarWithUsedEngine(carBuilder3);

        Car sportsCar = carBuilder1.getResult();
        Car suvCar = carBuilder2.getResult();
        Car usedSportsCar = carBuilder3.getResult();

        System.out.println(usedSportsCar.getEngine().getMileage());
        System.out.println(sportsCar.getEngine().getMileage());
        System.out.println(suvCar.getEngine().getVolume());
    }
}
