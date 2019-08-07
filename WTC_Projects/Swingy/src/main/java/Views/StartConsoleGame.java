package Views;

import Controllers.Console.BuildGame;
import Controllers.Parsing.ClassParse;

import java.util.Scanner;

public class StartConsoleGame {
    public static void startGame()throws NullPointerException {
        Scanner scan = new Scanner(System.in);
        boolean loadOrNew = false;

        printSplash();
        while (!loadOrNew){
            System.out.println("    Would you like to create a NEW hero or resume an OLD game?");
            System.out.println("    Type 'new' to start a new game or 'load' to resume an previous game\n");
            String mode = scan.nextLine();

            if (mode.toLowerCase().equals("new")) {
                System.out.println("\nPlease Enter A Name For Your Hero:\n");
                String username = scan.nextLine();
                System.out.println("Now that's a fierce name");
                System.out.println("Choose your class:\n");
                loadOrNew = true;

                boolean validation = false;
                String heroClassFinal = "class";
                while (!validation) {
                    try {
                        NewGameMenu.newGameMenu();
                        String heroClass = scan.nextLine();
                        if (ClassParse.checkClass(heroClass.toLowerCase())) {
                            heroClassFinal = heroClass;
                            validation = true;
                            break;
                        }
                        else
                            System.out.println("Invalid class name,  please try again");
                    } catch (NullPointerException e) {
                        System.out.println(e.getMessage());
                    }
                }
                BuildGame.newGame(username, heroClassFinal);
            }
            else if ((mode.toLowerCase()).equals("load")) {
                loadOrNew = true;
                BuildGame.loadGame();
            }
            else {
                System.out.println("Error in game input\n");
            }
        }
    }
    private  static void printSplash(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("        WELCOME TO:");
        System.out.println("     ___        _               _      _             _");
        System.out.println("    / __|_ __ _(_)_ _  __ _    /_\\  __| |_ _____ _ _| |_ _  _ _ _ ___ ___");
        System.out.println("    \\__ \\ V  V / | ' \\/ _` |  / _ \\/ _` \\ V / -_) ' \\  _| || | '_/ -_|_-<");
        System.out.println("    |___/\\_/\\_/|_|_||_\\__, | /_/ \\_\\__,_|\\_/\\___|_||_\\__|\\_,_|_| \\___/__/");
        System.out.println("                       |___/");
        System.out.println("                O                                           O");
        System.out.println("          {o)xxx|===============-     *     -===============|xxx(o}");
        System.out.println("                O                                           O");

    }
    public static void printCompass(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("          N");
        System.out.println("          |");
        System.out.println("     W -- 0 -- E");
        System.out.println("          |");
        System.out.println("          S");
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