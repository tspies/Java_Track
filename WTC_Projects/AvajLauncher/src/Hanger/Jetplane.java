package Hanger;

import InOut.Simulator;
import InOut.Simulator;
import Weather.WeatherTower;

public class Jetplane extends Aircraft implements Flyable {
    private WeatherTower weatherTower;

    Jetplane(String name, Coordinates coordinates)
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
                    outLine = "This is golf 9er 9er checking in crzzz";
                    if (height + 2 >= 100)
                    {
                        _coordinates = new Coordinates(longitude, latitude + 10, 100);
                        outLine += "Maximum altitude reached!";
                    }
                    else
                        _coordinates = new Coordinates(longitude, latitude + 10, height + 2);

                case "SNOW":
                    outLine = "All snowed in, brrrrr";
                    if (height - 7 <= 0){
                        _coordinates = new Coordinates(longitude, latitude, 0);
                        outLine += " jet engines are taking strain going down!";
                    }
                    else
                        _coordinates = new Coordinates (longitude, latitude, height - 7);

                case "FOG":
                    outLine = "Foggy up here, difficult to see";
                    _coordinates = new Coordinates(longitude, latitude + 1, height);

                case "RAIN":
                    outLine = "Ah what a rainy day we have here";
                    _coordinates = new Coordinates(longitude, latitude + 5, height);

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
        return ("jetplane");
    }
    public String getName(){
        return (this._name);
    }
    public String getId(){return Long.toString(this._id);}
}
