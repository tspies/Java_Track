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
                    moveHero("N", player, map);
                    break;
                case "east":
                    moveHero("E", player, map);
                    break;
                case "south":
                    moveHero("S", player, map);
                    break;
                case "west":
                    moveHero("W", player, map);
                    break;
                case "exit":
                    CommentaryOutput.quitGame();
                    exit = true;
            }
        }
    }
    public static void moveHero(String dir, Hero player, String[][] map){
        System.out.println("You have chosen: " + dir);
        if (dir == "N"){
            map[player.get_xCord() + 1][player.get_yCord()] = "^";
            map[player.get_xCord()][player.get_yCord()] = "@";
            if (player.get_xCord() > 0){
                player.set_xCord(player.get_xCord() - 1);
            }
            else
                System.out.println("Hit head against wall...owch");
        }
        if (dir == "E"){
            map[player.get_xCord()][player.get_yCord() - 1] = "^";
            map[player.get_xCord()][player.get_yCord()] = "@";
            if (player.get_xCord() < player.get_missionBuff()){
                player.set_yCord(player.get_yCord() + 1);
            }
            else
                System.out.println("Hit head against wall...owch");
        }
        if (dir == "S"){
            map[player.get_xCord() - 1][player.get_yCord()] = "^";
            map[player.get_xCord()][player.get_yCord()] = "@";
            if (player.get_xCord() < player.get_missionBuff()){
                player.set_xCord(player.get_xCord() + 1);
            }
            else
                System.out.println("Hit head against wall...owch");
        }
        if (dir == "W"){
            map[player.get_xCord()][player.get_yCord() + 1] = "^";
            map[player.get_xCord()][player.get_yCord()] = "@";
            if (player.get_xCord() > 0){
                player.set_yCord(player.get_yCord() - 1);
            }
            else
                System.out.println("Hit head against wall...owch");
        }
        BuildGame.printMap(9, map);
    }
}
