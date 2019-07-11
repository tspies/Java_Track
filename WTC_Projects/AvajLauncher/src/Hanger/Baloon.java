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
            System.out.println("Balloon Wheather ---> " + currentWeather + "\n");
            if(currentWeather == "SUN") {
                outLine = "Baloon#" + _name + "(" + _id + "): " + "Hmm it's sunny im just floating......all alone";
                if (height + 4 >= 100) {
                    _coordinates = new Coordinates(longitude + 2, latitude, 100);
                    outLine += " --> Maximum altitude reached!";
                } else
                    _coordinates = new Coordinates(longitude + 10, latitude, height + 2);
            }
            else if (currentWeather == "SNOW") {
                    outLine = "All snowwed in, brrrrr";
                    if (height - 15 <= 0) {
                        _coordinates = new Coordinates(longitude, latitude, 0);
                        outLine += "Baloon#" + _name + "(" + _id + "): " + "my baloon is frozen we are going down!";
                    } else
                        _coordinates = new Coordinates(longitude, latitude, height - 15);
            }
            else if (currentWeather == "FOG") {
                if (height - 3 <= 0) {
                    outLine = "Baloon#" + _name + "(" + _id + "): " + "It feels like im floating through a sauna....cold sauna";
                    _coordinates = new Coordinates(longitude, latitude, 0);
                } else {
                    outLine = "Baloon#" + _name + "(" + _id + "): " + "It feels like im floating through a sauna....cold sauna";
                    _coordinates = new Coordinates(longitude, latitude, height - 3);
                }
            }
            else if (currentWeather == "RAIN"){
                    if (height - 5 <= 0){
                        outLine = "Baloon#" + _name + "(" + _id + "): " + "The rain has washed me away, we are going down";
                        _coordinates = new Coordinates(longitude, latitude, 0);
                    }
                    else {
                        outLine = "Baloon#" + _name + "(" + _id + "): " + "Ah what a rainy day we have here";
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
