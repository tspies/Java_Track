package Tower;

public class WeatherProvider {
    private static WeatherProvider weatherProvider = new WeatherProvider();
    private String[] weather = {"FOG", "RAIN", "SNOW", "SUN"};

    private WeatherProvider()
    {
        return ;
    }
    public static WeatherProvider getProvider()
    {
        return WeatherProvider.weatherProvider;
    }

    public string getCurrentWeather(Coordinaates coordinates) {
        return (weather[((coordinates.getLatitude() > 20) ? 1 : 0) +
                        ((coordinates.getLongitude() > 10) ? 1 : 0) +
                        ((coordinates.getHeight() > 5) ? 1 : 0)]);
    }
}
