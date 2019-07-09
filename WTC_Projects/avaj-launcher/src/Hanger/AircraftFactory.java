package Hanger;

import java.io.FileNotFoundException;

public class AircraftFactory {
    enum vehicals
    {
        helicopter,
        jetplane,
        baloon

    }
    public Flyable newAircraft(string type, string name, int longitude, int latitude, int height) throws FileNotFoundException
    {
        Coordinates cords = new Coordinates(longitude, latitude, height);

        try
        {
            switch (vehicals.valueOf(type.toLowerCase()))
            {
                case baloon:
                    return new baloon(name, cords);

                case jetplane:
                    return new jetplane(name, cords);

                case helicopter:
                    return new helicopter(name, cords)
            }
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("Error File Not Found\n");
        }

    }
}
