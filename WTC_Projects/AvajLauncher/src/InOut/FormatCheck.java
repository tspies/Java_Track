package InOut;

import Exceptions.BadAirCraftException;
import Exceptions.BadLineException;
import Exceptions.InvalidSimLineException;
import Hanger.AircraftFactory;
import Hanger.Flyable;
import Weather.WeatherTower;

public class FormatCheck {
    static public int checkSimRuns(String simLine) throws InvalidSimLineException {
           String[] simRuns = simLine.trim().split("\\s");
           if (checkNumeric(simRuns[0])){
               int simsFinal = Integer.parseInt(simRuns[0]);
               return simsFinal;
           }
           else
               throw new InvalidSimLineException(simLine);
    }

    static public void processSimulations(WeatherTower weatherTower, String currLine) throws BadLineException,BadAirCraftException {
        String[] cleanLine = currLine.trim().split("\\s");
        if (cleanLine.length != 5) {
            throw new BadLineException(currLine + ": Bad number of arguments. ");
        }
        else
        {
            for (int i = 2; i < cleanLine.length; i++){
//                System.out.println(cleanLine[i]);
//                System.out.println(checkNumeric(cleanLine[i]));
                if (!checkNumeric(cleanLine[i]))
                    throw new BadLineException(currLine + ": Error -- " + cleanLine[i]);
            }
        }
        try {
            Flyable flyingMachine = new AircraftFactory().newAircraft(cleanLine[0], cleanLine[1],
                    (Integer.parseInt(cleanLine[2])),
                    (Integer.parseInt(cleanLine[3])),
                    (Integer.parseInt(cleanLine[4]))
            );
            flyingMachine.registerTower(weatherTower);
        }catch (BadAirCraftException ex){
            throw new BadAirCraftException("Aircraft Blew Up");
        }


    }
    static boolean checkNumeric(String simRuns){
        try {
            int num = Integer.parseInt(simRuns);
        }catch(NullPointerException | NumberFormatException ex){
            return false;
        }
        return true;
    }
}
