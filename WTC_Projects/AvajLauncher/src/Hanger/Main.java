package Hanger;

import Exceptions.BadAirCraftException;
import Exceptions.BadLineException;
import Exceptions.InvalidSimLineException;
import InOut.FormatCheck;
import InOut.Simulator;
import Weather.WeatherTower;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] av) throws BadAirCraftException, BadLineException, InvalidSimLineException {
        int simulationNum = 0;
        BufferedReader buff = null;

        if (av.length == 1){
            try{
                buff = new BufferedReader(new FileReader(av[0]));
                String fileLine;

                // First line get number of simulations
                if ((fileLine = buff.readLine()) != null)
                    simulationNum = FormatCheck.checkSimRuns(fileLine);

                WeatherTower weatherTower = new WeatherTower();
                while((fileLine = buff.readLine()) != null){
                    FormatCheck.processSimulations(weatherTower, fileLine);
                }

                for (int i = 0; i < simulationNum; i++)
                    weatherTower.weatherChange();
                Simulator.appendOutFile("TEXTing while driving\n");
                Simulator.simulationOut();
                System.out.println("Finished main\n");
            }catch(IOException ex){
                System.out.println("BROKEN!!!\n");
            }finally {
                try{
                    if (buff != null)
                        buff.close();
                }catch(IOException ex){
                    ex.printStackTrace();
                    System.out.println("Could Not close file\n");
                }
            }

        }
        else{
            System.out.println("File Not Found\n");
        }
    }
}
