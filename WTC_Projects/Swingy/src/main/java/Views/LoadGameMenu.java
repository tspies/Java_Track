package Views;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LoadGameMenu {
    public static void loadGameMenu(ArrayList<String> savedGameNames){
        printLoadSplash();
        printLoadMenu(savedGameNames);
    }

    private static void printLoadSplash() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\033[32;1m"+"           _____                     _   _____");
        System.out.println("          /  ___|                   | | |  __ \\");
        System.out.println("          \\ `--.  __ ___   _____  __| | | |  \\/ __ _ _ __ ___   ___  ___");
        System.out.println("            `--.\\/ _` \\ \\ / / _ \\/ _` | | | __ / _` | '_ ` _ \\ / _ \\/ __|");
        System.out.println("          /\\__/ / (_| |\\ V /  __/ (_| | | |_\\ \\ (_| | | | | | |  __/\\__ \\");
        System.out.println("          \\____/ \\__,_| \\_/ \\___|\\__,_|  \\____/\\__,_|_| |_| |_|\\___||___/"+"\033[32;1m");

    }

    private static void printLoadMenu(ArrayList<String> savedGameNames){
        String line;
        String[] elem;
        ArrayList<String> savedGames = savedGameNames;
        try{
            BufferedReader reader= new BufferedReader(new FileReader("src/main/java/Controllers/savedgames.txt"));
            System.out.println("\033[32;1m"+"\n             |^^^^^^^^^^^^^^^|^^^^^^^^^^^^^^^|\n             | NAME          | CLASS         |\n             |_______________|_______________|");
            while ((line = reader.readLine()) != null) {
                elem = line.split(",");
                savedGames.add(elem[0]);
                System.out.print("             | " + elem[0]);
                for (int i = 0; i < (14 - (elem[0].length())); i++){
                    System.out.print(" ");
                }
                System.out.print("| " + elem[1]);
                for (int i = 0; i < (14 - (elem[1].length())); i++){
                    System.out.print(" ");
                }
                System.out.print("|\n");
            }
            System.out.println("             |_______________|_______________|"+"\033[32;0m");
        }catch(FileNotFoundException ex)
        {

        }catch(IOException e){

        }
    }

}
//
//         _____                     _   _____
//        /  ___|                   | | |  __ \
//        \ `--.  __ ___   _____  __| | | |  \/ __ _ _ __ ___   ___  ___
//         `--. \/ _` \ \ / / _ \/ _` | | | __ / _` | '_ ` _ \ / _ \/ __|
//        /\__/ / (_| |\ V /  __/ (_| | | |_\ \ (_| | | | | | |  __/\__ \
//        \____/ \__,_| \_/ \___|\__,_|  \____/\__,_|_| |_| |_|\___||___/
//
