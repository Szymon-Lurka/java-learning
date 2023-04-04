package Builders.builders;

import Builders.cars.CarTypes;
import Builders.components.Engine;
import Builders.components.GPSController;
import Builders.components.Transmission;
import Builders.components.TripComputer;

public interface Builder {
    void setCarType(CarTypes type);
    void setEngine(Engine engine);
    void setSeats(int seats);
    void setTransmission(Transmission transmission);
    void setGPSController(GPSController gpsController);
    void setTripComputer(TripComputer tripComputer);

}
