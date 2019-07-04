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
                    return null;

                case jetplane:
                    return null;

                case helicopter:
                    return null;
            }
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("Error File Not Found\n");
        }

    }
}
