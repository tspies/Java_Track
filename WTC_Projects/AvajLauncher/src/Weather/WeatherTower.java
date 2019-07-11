package Weather;

import Hanger.Coordinates;

public class WeatherTower extends Tower {
    public String getWeather(Coordinates coordinates){
      return (WeatherProvider.getProvider().getCurrentWeather(coordinates));
    }

    public void weatherChange(){
        this.conditionsChanged();
    }
}
