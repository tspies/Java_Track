package Views;

import Controllers.Console.BuildGame;
import java.util.Scanner;

public class StartConsoleGame {
    public static void startGame(){
        Scanner scan = new Scanner(System.in);

        printSplash();
        System.out.println("    Would you like to create a NEW hero or resume an OLD game?");
        System.out.println("    Type 'new' to start a new game or 'load' to resume an previous game\n");
        String mode = scan.nextLine();

        if (mode.toLowerCase().equals("new")){
            System.out.println("\nPlease Enter A Name For Your Hero:\n");
            String username = scan.nextLine();
            NewGameMenu.newGameMenu();
            String heroClass = scan.nextLine();
            BuildGame.newGame(username, heroClass);
        }
        else if ((mode.toLowerCase()).equals("load")){

        }
        else{
            System.out.println("Error in game input\n");
        }
    }
    private  static void printSplash(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("    WELCOME TO:");
        System.out.println("  ___        _               _      _             _");
        System.out.println(" / __|_ __ _(_)_ _  __ _    /_\\  __| |_ _____ _ _| |_ _  _ _ _ ___ ___");
        System.out.println(" \\__ \\ V  V / | ' \\/ _` |  / _ \\/ _` \\ V / -_) ' \\  _| || | '_/ -_|_-<");
        System.out.println(" |___/\\_/\\_/|_|_||_\\__, | /_/ \\_\\__,_|\\_/\\___|_||_\\__|\\_,_|_| \\___/__/");
        System.out.println("                    |___/");
        System.out.println("             O                                           O");
        System.out.println("       {o)xxx|===============-     *     -===============|xxx(o}");
        System.out.println("             O                                           O");

    }
}
//         ___        _               _      _             _
//        / __|_ __ _(_)_ _  __ _    /_\  __| |_ _____ _ _| |_ _  _ _ _ ___ ___
//        \__ \ V  V / | ' \/ _` |  / _ \/ _` \ V / -_) ' \  _| || | '_/ -_|_-<
//        |___/\_/\_/|_|_||_\__, | /_/ \_\__,_|\_/\___|_||_\__|\_,_|_| \___/__/
//                           |___/

//        O                                     O
//  {o)xxx|===============-  *  -===============|xxx(o}
//        O                                     O