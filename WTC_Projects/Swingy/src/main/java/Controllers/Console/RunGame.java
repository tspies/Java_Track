package Controllers.Console;

import Models.Heros.Hero;
import Views.CommentaryOutput;
import Views.StartConsoleGame;

import java.util.Scanner;
public class RunGame {
    public static void runGameLoop(Hero player, String[][] map){
        boolean noob = true;
        boolean exit = false;
        boolean winMission = false;
        Scanner scan = new Scanner(System.in);
        if (player.get_level() == 1 && noob){
            CommentaryOutput.introOut(player.get_name());
            noob = false;
        }

        while(!exit)
        {
            CommentaryOutput.nextMoveOut();
            String move = scan.nextLine();
            boolean win = false;
            switch(move.toLowerCase()){
                case "north":
                case "n":
                    win = moveHero("N", player, map);
                    if (win == true){
                        exit = true;
                        winMission = true;
                    }
                    break;
                case "e":
                case "east":
                    win = moveHero("E", player, map);
                    break;
                case "s":
                case "south":
                    win = moveHero("S", player, map);
                    break;
                case "w":
                case "west":
                    win = moveHero("W", player, map);
                    break;
                case "exit":
                    CommentaryOutput.quitGame();
                    exit = true;
                    default:
                        System.out.println("Invalid Direction Please try Again");
            }
        }
        if (winMission){
            return;
        }
    }
    public static boolean moveHero(String dir, Hero player, String[][] map){
        boolean win = false;
        if (dir == "N"){
            if (player.get_xCord()  - 1 > 0){
                player.set_xCord(player.get_xCord() - 1);
                map[player.get_xCord()][player.get_yCord()] = "@";
                map[player.get_xCord() + 1][player.get_yCord()] = "^";
            }
            else if (player.get_xCord() - 1 == 0){
                win = true;
                player.set_xCord(player.get_xCord() - 1);
                Views.CommentaryOutput.winMissionOut(player);
            }
            else
                System.out.println("Hit head against wall...owch");
        }
        else if(dir == "E"){
            if (player.get_yCord() + 1 < player.get_missionBuff()){
                player.set_yCord(player.get_yCord() + 1);
                map[player.get_xCord()][player.get_yCord()] = "@";
                map[player.get_xCord()][player.get_yCord() - 1] = "^";
            }
            else if (map[player.get_xCord()][player.get_yCord()] == "#")
                Views.CommentaryOutput.winMissionOut(player);
            else
                System.out.println("Hit head against wall...owch");
        }
        else if (dir == "S"){
            if (player.get_xCord() + 1 < player.get_missionBuff()){
                player.set_xCord(player.get_xCord() + 1);
                map[player.get_xCord()][player.get_yCord()] = "@";
                map[player.get_xCord() - 1][player.get_yCord()] = "^";
            }
            else if (map[player.get_xCord()][player.get_yCord()] == "#")
                Views.CommentaryOutput.winMissionOut(player);
            else
                System.out.println("Hit head against wall...owch");
        }
        else if (dir == "W"){
            if (player.get_yCord() > 0){
                player.set_yCord(player.get_yCord() - 1);
                map[player.get_xCord()][player.get_yCord()] = "@";
                map[player.get_xCord()][player.get_yCord() + 1] = "^";
            }
            else if (map[player.get_xCord()][player.get_yCord()] == "#")
                Views.CommentaryOutput.winMissionOut(player);
            else
                System.out.println("Hit head against wall...owch");

        }
        if (!win){
            Views.StartConsoleGame.printCompass();
            BuildGame.printMap(player.get_missionBuff(), map);
            System.out.print(player.get_xCord());
        }
        return win;
    }
}
