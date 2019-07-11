package Weather;

import Hanger.Coordinates;

public class WeatherProvider {
    private static WeatherProvider weatherProvider = new WeatherProvider();
    private String[] weather = {"FOG", "RAIN", "SNOW", "SUN"};

    private WeatherProvider()
    {
        return;
    }
    public static WeatherProvider getProvider(){
        return (weatherProvider);
    }
    public String getCurrentWeather(Coordinates coordinates){
        int randSeed = coordinates.getHeight() + coordinates.getLongitude() + coordinates.getLatitude();
        return (weather[randSeed % 4]);
    }
}
