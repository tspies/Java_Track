package Hanger;

import Tower.Flyable;
import Tower.WeatherTower;

public class Helicopter extends Aircraft implements Flyable {
    private WeatherTower _weatherTower;

    Helicopter(string name, Coordinates coordinates)
    {
        // Using the 'super()' class to access parent classes' constructor
        super(name, coordinates);
    }
    public void updateConditions()
    {
        String currentWeather = weatherTower.getWeather(this.coordinates);

        switch (currentWeather) {
            case "FOG":
                this.coordinates = new Coordinates(coordinates.getLongitude() + 1, coordinates.getLatitude(), coordinates.getHeight());
                break;
            case "RAIN":
                this.coordinates = new Coordinates(coordinates.getLongitude() + 5, coordinates.getLatitude(), coordinates.getHeight());
                break;
            case "SNOW":
                this.coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude(), coordinates.getHeight() - 12);
                break;
            case "SUN":
                this.coordinates = new Coordinates(coordinates.getLongitude() + 10, coordinates.getLatitude(), coordinates.getHeight() + 2);
                break;
        }
    }
    public void registerTower(WeatherTower weatherTower)
    {
        Simulation.writer.println("Tower says: Helicopter#" + name + "(" + id + ")" + "registered to weather tower");
        _weatherTower = weatherTower;
        _weatherTower.register(this);
    }
}
