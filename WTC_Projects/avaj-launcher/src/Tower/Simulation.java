import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Simulator
{
    public static PrintWriter writer;
    public static List<Flyable> flyList = new ArrayList<>();
    public void main(String av[])
    {
        WeatherTower weatherTower = new WeatherTower();

        try
        {
            writer = new PrintWriter(new FileWriter("simulation.txt"));
            BufferedReader reader = new BufferedReader(new FileReader(av[0]);
            String lineData = reader.readline();
            int simAmount = Interger.parseInt(lineData.split(" ")[0]);

            while ((lineData = reader.readLine()) != null)
            {
                Flyable flyable = AircraftFactory.newAircraft(
                        lineData.split(" ")[0],
                        lineData.split(" ")[1],
                        Integer.parseInt(lineData.split(" ")[2]),
                        Integer.parseInt(lineData.split(" ")[3]),
                        Integer.parseInt(lineData.split(" ")[4])
                );
                flyList.add(flyable);
            }
            for (Flyable flyable : flyList)
                flyable.registerTower;

            for (int i = 0; i < simAmount; i++)
                weatherTower.changeWeather();)
        }
        }
        catch()
        {

        }

}