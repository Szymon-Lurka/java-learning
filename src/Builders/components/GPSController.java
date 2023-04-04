package Builders.components;

public class GPSController {
    private String route;
    private String destination;

    void setDestination(String destination) {
        this.destination = destination;
    }

    public String getRoute() {
        return route;
    }

    public String getDestination() {
        return destination;
    }
}
