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
            gameFile.print("\n");
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
    public static Hero loadHero(){
        String line;
        String[] elem;
        Hero player = null;
        ArrayList<String> savedGameNames = new ArrayList<>(100);
        boolean validation = false;
        Scanner scan = new Scanner(System.in);
        Views.LoadGameMenu.loadGameMenu();
        try{
            BufferedReader reader= new BufferedReader(new FileReader("src/main/java/Controllers/savedgames.txt"));
            System.out.println(" |^^^^^^^^^^^^^^^|^^^^^^^^^^^^^^^|\n | NAME          | CLASS         |\n |_______________|_______________|");
            while ((line = reader.readLine()) != null) {
                elem = line.split(",");
                savedGameNames.add(elem[0]);
                System.out.print(" | " + elem[0]);
                for (int i = 0; i < (14 - (elem[0].length())); i++){
                  System.out.print(" ");
                }
                System.out.print("| " + elem[1]);
                for (int i = 0; i < (14 - (elem[1].length())); i++){
                    System.out.print(" ");
                }
                System.out.print("|\n");
            }
            while (!validation){
                System.out.println("Which Game Would You Like To Load?");
                String nameToLoad = scan.nextLine();
                if (savedGameNames.contains(nameToLoad))
                    validation = true;
                if (validation){
                    player = getHeroStats(nameToLoad);
                    if (player == null)
                        System.out.println("NULL IN LOAD HERO");
                    break;
                    ///////Adding redirect for loaded game here.
                }
                else
                    System.out.println("Invalid Input please try again");
            }
        }catch(FileNotFoundException ex)
        {

        }catch(IOException e){

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
