package Hanger;

import InOut.Simulator;
import Weather.WeatherTower;

public class Baloon extends Aircraft implements Flyable {
    private WeatherTower weatherTower;

    Baloon(String name, Coordinates coordinates)
    {
        super(name, coordinates);
    }

    public void updateConditions()
    {
        int longitude = _coordinates.getLongitude();
        int latitude = _coordinates.getLatitude();
        int height = _coordinates.getHeight();

        String currentWeather = this.weatherTower.getWeather(_coordinates);
        String outLine = null;

        if (height <= 0){
            outLine = this.getType() + "#" + this.getName() + "(" + this.getId() + "): Mayday Mayday We are going down!";
            Simulator.appendOutFile(outLine);
            this.weatherTower.unregister(this);
        }
        else{
            switch(currentWeather){
                case "SUN":
                    outLine = "Hmm im just floating......im lonley ";
                    if (height + 4 >= 100)
                    {
                        _coordinates = new Coordinates(longitude + 2, latitude, 100);
                        outLine += "Maximum altitude reached!";
                    }
                    else
                        _coordinates = new Coordinates(longitude + 10, latitude, height + 2);

                case "SNOW":
                    outLine = "All snowwed in, brrrrr";
                    if (height - 15 <= 0){
                        _coordinates = new Coordinates(longitude, latitude, 0);
                        outLine += "my baloon is frozen we are going down!";
                    }
                    else
                        _coordinates = new Coordinates (longitude, latitude, height - 15);

                case "FOG":
                    if (height - 3 <= 0){
                        outLine = "It feels like im floating through a sauna....cold sauna";
                        _coordinates = new Coordinates(longitude, latitude, 0);
                    }
                    else {
                        outLine = "It feels like im floating through a sauna....cold sauna";
                        _coordinates = new Coordinates(longitude, latitude, height - 3);
                    }

                case "RAIN":
                    if (height - 5 <= 0){
                        outLine = "The rain has washed me away, we are going down";
                        _coordinates = new Coordinates(longitude, latitude, 0);
                    }
                    else {
                        outLine = "Ah what a rainy day we have here";
                        _coordinates = new Coordinates(longitude, latitude, height - 5);
                    }

            }
            Simulator.appendOutFile(outLine);
        }
    }

    public void registerTower(WeatherTower weatherTower)
    {
        weatherTower.register(this);
        this.weatherTower = weatherTower;
    }
    public String getType(){
        return ("baloon");
    }
    public String getName(){
        return (this._name);
    }
    public String getId(){return Long.toString(this._id);}
}
