package Controllers.Console;

import Models.Heros.Hero;

import java.io.*;
import java.util.*;

public class SaveLoadHandler {
    public static void saveHero(Hero player){
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter gameFile = null;
        try {
            fw = new FileWriter("src/main/java/Controllers/savedgames.txt", true);
            bw = new BufferedWriter(fw);
            gameFile = new PrintWriter(bw);
            gameFile.print(player.get_name() + ",");
            gameFile.print(player.get_class() + ",");
            gameFile.print(player.get_level() + ",");
            gameFile.print(player.get_experience() + ",");
            gameFile.print(player.get_attack() + ",");
            gameFile.print(player.get_defense() + ",");
            gameFile.print(player.get_hitpoints() + ",");
            if (player.get_attackArt() != "empty")
                gameFile.print(player.get_attackArt() + ",");
            if (player.get_defenseArt() != "empty")
                gameFile.print(player.get_attackArt() + ",");
            if (player.get_armorArt() != "empty")
                gameFile.print(player.get_attackArt() + ",");
            gameFile.print("~\n");
            gameFile.close();
        } catch (IOException e) {
            //exception handling left as an exercise for the reader
        }
        finally {
            try {
                if(gameFile != null)
                    gameFile.close();
                else
                    throw  new IOException();
            } catch (IOException e) {
                //exception handling left as an exercise for the reader
            }
            try {
                if(bw != null)
                    bw.close();
            } catch (IOException e) {
                //exception handling left as an exercise for the reader
            }
            try {
                if(fw != null)
                    fw.close();
            } catch (IOException e) {
                //exception handling left as an exercise for the reader
            }
        }
    }
    public static void  replaceFile(Hero player){
        try{
            BufferedReader file = new BufferedReader(new FileReader("src/main/java/Controllers/savedgames.txt"));
            StringBuffer inputBuffer = new StringBuffer();
            String line;
            String heroOldStats = null;
            String[] array;
            while((line = file.readLine()) != null){
                inputBuffer.append(line);
                inputBuffer.append("\n");
                array = line.split(",");
                if (array[0].equals(player.get_name())){
                    heroOldStats = line;
                }
            }
            file.close();
            String inputStr = inputBuffer.toString();
            inputStr = inputStr.replace(heroOldStats, formatSaveLine(player));
            FileOutputStream fileOut = new FileOutputStream("src/main/java/Controllers/savedgames.txt");
            fileOut.write(inputStr.getBytes());
            fileOut.close();
        }catch(Exception e){

        }
    }
    private static String formatSaveLine(Hero player){
        String formatted;
        formatted = player.get_name() + "," + player.get_class() + "," + player.get_level() + "," + player.get_experience() + "," + player.get_attack() + "," + player.get_defense() + "," + player.get_hitpoints() + ",~./r    ";
        return formatted;
    }

    public static Hero loadHero(){
        Hero player = null;
        ArrayList<String> savedGameNames = new ArrayList<>(100);
        boolean validation = false;
        Scanner scan = new Scanner(System.in);
            while (!validation){
                Views.LoadGameMenu.loadGameMenu(savedGameNames);
                System.out.println("\n             Which Game Would You Like To Load?");
                String nameToLoad = scan.nextLine();
                if (savedGameNames.contains(nameToLoad))
                    validation = true;
                if (validation){
                    player = getHeroStats(nameToLoad);
                    break;
                    ///////Adding redirect for loaded game here.
                }
                else
                    System.out.println("Invalid Input please try again");
            }
        return player;
    }

    private static Hero getHeroStats(String name){
        String line;
        String elem[];
        Hero player = null;
        try{
            BufferedReader reader = new BufferedReader(new FileReader("src/main/java/Controllers/savedgames.txt"));
            while ((line = reader.readLine()) != null){
                elem = line.split(",");
                if (name.equals(elem[0])){
                    player = Models.Heros.HeroFactory.generateLoadedHero(elem);
                    break;
                }
            }
        }catch(FileNotFoundException ex)
        {

        }catch(IOException e){

        }
        return player;
    }
}
