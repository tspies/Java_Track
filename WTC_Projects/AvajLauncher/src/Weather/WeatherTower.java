package Weather;

import Hanger.Coordinates;

public class WeatherTower extends Tower {
    public String getWeather(Coordinates coordinates){
        if (WeatherProvider.getProvider() == null)
            System.out.println("BROKEN\n");
      return (WeatherProvider.getProvider().getCurrentWeather(coordinates));
    }

    public void weatherChange(){
        this.conditionsChanged();
    }
}
