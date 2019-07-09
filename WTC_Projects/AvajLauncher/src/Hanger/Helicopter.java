package Hanger;

import InOut.Simulator;
import InOut.Simulator;
import Weather.WeatherTower;

public class Helicopter extends Aircraft implements Flyable {
    private WeatherTower weatherTower;

    Helicopter(String name, Coordinates coordinates)
    {
        super(name, coordinates);
    }

    public void updateConditions()
    {
        int longitude = _coordinates.getLongitude();
        int latitude = _coordinates.getLatitude();
        int height = _coordinates.getHeight();

        String currentWeather = this.weatherTower.getWeather(_coordinates);
        String outLine;

        if (height <= 0){
            outLine = this.getType() + "#" + this.getName() + "(" + this.getId() + "): Mayday Mayday We are going down!";
            Simulator.appendOutFile(outLine);
            this.weatherTower.unregister(this);
        }
        else{
            switch(currentWeather){
                case "SUN":
                    outLine = "Its a clear sky ahead huston, over crrrrzz ";
                    if (height + 2 >= 100)
                    {
                        _coordinates = new Coordinates(longitude + 10, latitude, 100);
                        outLine += "Maximum altitude reached!";
                    }
                    else
                        _coordinates = new Coordinates(longitude + 10, latitude, height + 2);

                case "SNOW":
                    outLine = "All snowwed in, brrrrr";
                    if (height - 12 <= 0){
                        _coordinates = new Coordinates(longitude, latitude, 0);
                        outLine += "the snow is too much we are going down!";
                    }
                    else
                        _coordinates = new Coordinates (longitude, latitude, height - 12);

                case "FOG":
                        outLine = "Foggy up here, difficult to see";
                        _coordinates = new Coordinates(longitude + 1, latitude, height);

                case "RAIN":
                        outLine = "Ah what a rainy day we have here";
                        _coordinates = new Coordinates(longitude + 5, latitude, height);

                Simulator.appendOutFile(outLine);

            }
        }
    }

    public void registerTower(WeatherTower weatherTower)
    {
        weatherTower.register(this);
        this.weatherTower = weatherTower;
    }

    public String getType(){
        return ("helicopter");
    }
    public String getName(){
        return (this._name);
    }
    public String getId(){return Long.toString(this._id);}
}

