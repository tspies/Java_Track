package Controllers.Console;

import Models.Heros.Hero;

import java.io.*;

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
    public static String[] loadHero(){
        String line;
        String[] elem = null;
        Views.LoadGameMenu.loadGameMenu();
        try{
            BufferedReader reader= new BufferedReader(new FileReader("src/main/java/Controllers/savedgames.txt"));
            while ((line = reader.readLine()) != null) {
                elem = line.split(",");
                System.out.println("  " + elem[0] + " ==> " + elem[1]);

            }
        }catch(FileNotFoundException ex)
        {

        }catch(IOException e){

        }
        return elem;
    }
}
