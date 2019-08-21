package Views;

import java.util.Scanner;
import Models.Heros.*;

public class CommentaryOutput {
    static Scanner scan = new Scanner(System.in);

    public static void introOut(String heroName){
        System.out.println("     Ok " + "'" +heroName + "'" + ", since you are a rookie, here is the down low:");
        System.out.println("     You are in a dungeon, and you can  only move one step per turn.\n");
        System.out.println("     The four directions you can move are North, South, East and West");
        System.out.println("     There are many dangers lurking in the dark and treasures to.\n");
        System.out.println("     Reach the edge of the map to win the current quest");
        System.out.println("     Where is the edge of the map....thats for you to find out.\n");
        System.out.println("     GOOD LUCK ADVENTURER");
        System.out.println("     Press any key to continue...");
        scan.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void nextMoveOut(){
        System.out.println("     Which direction do you want to move?");
    }
    public static void winMissionOut(){ System.out.println("    Winner Winner Chicken Dinner!\n     You've Found Your Way Out!");}

    public static void quitGame(){
        System.out.println("You have failed, goodbye");
        System.exit(0);
    }
}
