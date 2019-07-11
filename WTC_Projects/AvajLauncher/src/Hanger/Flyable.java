package Hanger;

import Weather.WeatherTower;

public interface Flyable {
    public void updateConditions();
    public void registerTower(WeatherTower WeatherTower);
    String getType();
    String getId();
    String getName();
}
