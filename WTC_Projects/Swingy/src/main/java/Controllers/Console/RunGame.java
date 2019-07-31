package Controllers.Console;

import Models.Heros.Hero;
import Views.CommentaryOutput;
import java.util.Scanner;
public class RunGame {
    public static void runGameLoop(Hero player, String[][] map){
//        BuildGame.printMap(9, map);
        boolean noob = true;
        boolean exit = false;
        Scanner scan = new Scanner(System.in);
        if (player.get_level() == 1 && noob){
            CommentaryOutput.introOut(player.get_name());
            noob = false;
        }
        while(!exit)
        {
            CommentaryOutput.nextMoveOut();
            String move = scan.nextLine();
            switch(move.toLowerCase()){
                case "north":
                    moveHero("N", player);
                case "east":
                    moveHero("E", player);
                case "south":
                    moveHero("S", player);
                case "west":
                    moveHero("W", player);
                case "exit":
                    CommentaryOutput.quitGame();
                    exit = true;
            }
        }
    }
    public static void moveHero(String dir, Hero player){
        return;
    }
}
