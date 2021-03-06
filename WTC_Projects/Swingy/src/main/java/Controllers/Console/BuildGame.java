package Controllers.Console;

import Models.Enemies.Villan;
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
        String[][] map = generateMap(player);
        nextGame = RunGame.runGameLoop(player, map);
        while (nextGame){
            System.out.println("Do you want to continue? ('yes' to continue or 'no' to exit)");
            String playAgain = scan.nextLine();
            if(playAgain.toLowerCase().equals("yes")){
                map = generateMap(player);
                nextGame = RunGame.runGameLoop(player, map);
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
        for (int i = 0; i < buff; i++){
            for (int j = 0; j < buff; j++){
                map[i][j] = "\033[32;1m"+"^"+"\033[32;0m";
            }
        }
        // Filling in borders for win condition
        for (int i = 0; i < buff; i++){
            map[0][i] = "\033[34;1m"+"#"+"\033[34;0m";
            map[buff - 1][i] = "\033[34;1m"+"#"+"\033[34;0m";
        }
        for (int j = 0; j < buff; j++){
            map[j][0] = "\033[34;1m"+"#"+"\033[34;0m";
            map[j][buff - 1] = "\033[34;1m"+"#"+"\033[34;0m";
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
    public static int villanWinExperience(Hero player, Villan enemy){
        int exp = 175 * (enemy.get_level());
        player.set_experience(player.get_experience() + exp);
        return exp;
    }
    public static int missionWinExperience(Hero player){
        int exp = 15 * player.get_missionBuff();
        player.set_experience(player.get_experience() + exp);
        return exp;
    }
    //----------
}