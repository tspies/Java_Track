package InOut;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Simulator {

    public static List<String> outFileArray = new ArrayList<>();
    public static BufferedWriter writer = null;

    static public void simulationOut(){
        try {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("simulation.txt"), StandardCharsets.UTF_8));
            writer.write("First Sim line\n\n");
            for (String liner : outFileArray)
                System.out.println(liner);
            for (String outLine : outFileArray){
                writer.write("Hello Worlds\n");
                writer.write(outLine);
            }

        }
        catch (IOException ex){

        }
    }

    static public void appendOutFile(String lineOut){
        outFileArray.add(lineOut + "\n");
    }
}
