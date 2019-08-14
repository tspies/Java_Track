package Controllers.Console;

import Models.Heros.Hero;
import Views.CommentaryOutput;
import Models.Enemies.*;

import java.util.Random;
import java.util.Scanner;
public class RunGame {
    public static void runGameLoop(Hero player, String[][] map) {
        boolean noob = true;
        boolean exit = false;
        boolean winMission = false;
        Scanner scan = new Scanner(System.in);
        if (player.get_level() == 1 && noob) {
            CommentaryOutput.introOut(player.get_name());
            noob = false;
        }

        while (!exit) {
            CommentaryOutput.nextMoveOut();
            String move = scan.nextLine();
            boolean win = false;
            switch (move.toLowerCase()) {
                case "north":
                case "n":
                    win = moveHero("N", player, map);
                    if (win == true) {
                        exit = true;
                        winMission = true;
                    }
                    break;
                case "e":
                case "east":
                    win = moveHero("E", player, map);
                    if (win == true) {
                        exit = true;
                        winMission = true;
                    }
                    break;
                case "s":
                case "south":
                    win = moveHero("S", player, map);
                    if (win == true) {
                        exit = true;
                        winMission = true;
                    }
                    break;
                case "w":
                case "west":
                    win = moveHero("W", player, map);
                    if (win == true) {
                        exit = true;
                        winMission = true;
                    }
                    break;
                case "exit":
                    CommentaryOutput.quitGame();
                    exit = true;
                default:
                    System.out.println("Invalid Direction Please try Again");
            }
        }
        if (winMission) {
            //Leveling up and experience goes here.
            System.out.println("Mission was won");
        }
    }

    private static boolean moveHero(String dir, Hero player, String[][] map) {
        boolean win = false;
        // Think about replacing this whole thing with a switch statment.
        Villan enemy = EnemyFactory.generateRandomEnemy();
        if (enemy == null) {
            if (dir.equals("N")) {
                if (player.get_xCord() - 1 > 0) {
                    player.set_xCord(player.get_xCord() - 1);
                    map[player.get_xCord()][player.get_yCord()] = "@";
                    map[player.get_xCord() + 1][player.get_yCord()] = "^";
                } else if (player.get_xCord() - 1 == 0) {
                    win = true;
                    player.set_xCord(player.get_xCord() - 1);
                    map[player.get_xCord()][player.get_yCord()] = "@";
                    map[player.get_xCord() + 1][player.get_yCord()] = "^";
                    Views.CommentaryOutput.winMissionOut(player);
                }
            } else if (dir.equals("E")) {
                if (player.get_yCord() + 2 < player.get_missionBuff()) {
                    player.set_yCord(player.get_yCord() + 1);
                    map[player.get_xCord()][player.get_yCord()] = "@";
                    map[player.get_xCord()][player.get_yCord() - 1] = "^";
                } else if (player.get_yCord() + 2 == player.get_missionBuff()) {
                    win = true;
                    player.set_yCord(player.get_yCord() + 1);
                    map[player.get_xCord()][player.get_yCord()] = "@";
                    map[player.get_xCord()][player.get_yCord() - 1] = "^";
                    Views.CommentaryOutput.winMissionOut(player);
                }
            } else if (dir.equals("S")) {
                if (player.get_xCord() + 2 < player.get_missionBuff()) {
                    player.set_xCord(player.get_xCord() + 1);
                    map[player.get_xCord()][player.get_yCord()] = "@";
                    map[player.get_xCord() - 1][player.get_yCord()] = "^";
                } else if (player.get_xCord() + 2 == player.get_missionBuff()) {
                    win = true;
                    player.set_xCord(player.get_xCord() + 1);
                    map[player.get_xCord()][player.get_yCord()] = "@";
                    map[player.get_xCord() - 1][player.get_yCord()] = "^";
                    Views.CommentaryOutput.winMissionOut(player);
                }
            } else if (dir.equals("W")) {
                if (player.get_yCord() - 1 > 0) {
                    player.set_yCord(player.get_yCord() - 1);
                    map[player.get_xCord()][player.get_yCord()] = "@";
                    map[player.get_xCord()][player.get_yCord() + 1] = "^";
                } else if (player.get_yCord() - 1 == 0) {
                    win = true;
                    player.set_yCord(player.get_yCord() - 1);
                    map[player.get_xCord()][player.get_yCord()] = "@";
                    map[player.get_xCord()][player.get_yCord() + 1] = "^";
                    Views.CommentaryOutput.winMissionOut(player);
                }
            }
            if (!win) {
                Views.StartConsoleGame.printCompass();
                BuildGame.printMap(player.get_missionBuff(), map);
            }
        }
        else{
            boolean fightOrRun;
            fightOrRun = encounterEnemy(enemy);
            if (!fightOrRun){
                System.out.println("You Won The Battle");
            }
            else{
                startBattle(player, enemy);
            }
        }

        return win;
    }
    private static boolean encounterEnemy(Villan enemy){
        Views.FightOutput.encounterOutput(enemy);
        boolean fight = false;
        boolean validation = false;
        Scanner scan = new Scanner(System.in);
        Random runChance = new Random();
        Hero player = null;
        while (!validation){
            String fightOrFlight = scan.nextLine();
            switch(fightOrFlight.toLowerCase()){
                case "fight":{
                    System.out.println("FIGHTING");
                    fight = true;
                    validation = true;
                    break;
                }
                case "run":{
                    if (runChance.nextInt(2) == 1)
                    {
                        System.out.println("RUNNING");
                        fight = false;
                        validation = true;
                    }
                    else{
                        System.out.println("RUN FAILED< DUM DUM DUUUUUUM!");
                        System.out.println("Press any key to continue...");
                        scan.nextLine();
                        fight = true;
                        validation = true;
                    }
                    break;
                }
                default:
                    Views.FightOutput.encounterOutput(enemy);
                    System.out.println("Invalid Input");
            }
        }
        return fight;
    }
    private static boolean startBattle(Hero player, Villan enemy){
        Views.FightOutput.loadFightScreen(player, enemy);

        System.out.println("Battle Has been started");

        return true;
    }
    ////--------
}
