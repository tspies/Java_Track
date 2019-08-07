package Controllers.Console;

import Models.Heros.Hero;
import Models.Heros.HeroFactory;
import java.util.Scanner;

public class BuildGame {

    public static void newGame(String name, String heroClass){
         boolean nextGame = true;
         Scanner scan = new Scanner(System.in);
         Hero player = HeroFactory.generateNewHero(name, heroClass);
         String[][] map = generateMap(player);
         SaveLoadHandler.saveHero(player);
         RunGame.runGameLoop(player, map);
         while (nextGame){
             System.out.println("Do you want to continue? ('yes' to continue or 'no' to exit)");
             String playAgain = scan.nextLine();
             if(playAgain.toLowerCase().equals("yes")){
                 map = generateMap(player);
                 RunGame.runGameLoop(player, map);
             }
             else if (playAgain.toLowerCase().equals("no")){
                 nextGame = false;
             }
         }
    }
    public static  void loadGame(){
        boolean nextGame = true;
        Scanner scan = new Scanner(System.in);
        Hero player = SaveLoadHandler.loadHero();
        if (player == null)
            System.out.println("NULL NULL NULL");
        String[][] map = generateMap(player);
        RunGame.runGameLoop(player, map);
        while (nextGame){
            System.out.println("Do you want to continue? ('yes' to continue or 'no' to exit)");
            String playAgain = scan.nextLine();
            if(playAgain.toLowerCase().equals("yes")){
                map = generateMap(player);
                RunGame.runGameLoop(player, map);
            }
            else if (playAgain.toLowerCase().equals("no")){
                System.out.println("Good Bye ^_^");
                nextGame = false;
            }
        }
    }
    private static String[][] generateMap(Hero player){
        int buff = ((player.get_level()-1)*5+10-(player.get_level()%2));
        String[][] map = new String[buff][buff];
        // Filling the map will "Walkable" terrain
        for (int i = 0; i < buff; i++){
            for (int j = 0; j < buff; j++){
                map[i][j] = "^";
            }
        }
        // Filling in borders for win condition
        for (int i = 0; i < buff; i++){
            map[0][i] = "#";
            map[buff - 1][i] = "#";
        }
        for (int j = 0; j < buff; j++){
            map[j][0] = "#";
            map[j][buff - 1] = "#";
        }
        initPlayerPos(player, buff);
        return map;
    }
    public static void printMap(int buff, String[][] map){
        System.out.print("\n");
        for (int i = 0; i < buff; i++){
            System.out.print("     ");
            for (int j = 0; j < buff; j++){
                System.out.print(map[i][j]);
            }
            System.out.print("\n");
        }
    }
    private static void initPlayerPos(Hero player, int buff){
        player.set_missionBuff(buff);
        if ((buff % 2) == 0){
            player.set_xCord(buff/2 + 1);
            player.set_yCord(buff/2 - 1);
        }
        else
        {
            player.set_xCord(buff / 2);
            player.set_yCord(buff / 2);
        }
    }

    //----------
}