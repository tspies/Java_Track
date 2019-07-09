package Hanger;

import Exceptions.BadAirCraftException;

public class AircraftFactory {
    public Flyable newAircraft(String type, String name, int longitude, int latitude, int height)throws BadAirCraftException {
        Coordinates cords = new Coordinates(longitude, latitude, height);

        switch (type.toLowerCase()) {
            case "helicopter":
                return (new Helicopter(name, cords));
            case "jetplane":
                return (new Jetplane(name, cords));
            case "baloon":
                return (new Baloon(name, cords));
                default:
                    return(null);
        }
    }
}
