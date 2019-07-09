package Tower;

public class WeatherTower extends Tower{
    public String getWeather(Coordinates coordinates) {
        return WheatherProvider.getProvider().getCurrentWeather(coordinates);
    }

    void changeWeather() { conditionsChanged(); }
}
