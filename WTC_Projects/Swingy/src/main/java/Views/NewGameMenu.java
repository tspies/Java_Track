package Views;

import Controllers.Console.NewGameStats;

public class NewGameMenu {
    public static String[] heros = {"Mage", "Rogue", "Warrior"};
    public static String[] attribute = {"Attack", "Defense", "HP"};
    public static void newGameMenu(){
        for (int i=0; i < 3; i++){
            System.out.println("            " + heros[i].toUpperCase() + ":");
            Integer[] stats = NewGameStats.classStats(heros[i]);
            System.out.println("{--------------------------}");
            for (int x = 0; x < 3; x++){
                stats[x] = stats[x] / 10;
                System.out.print("      " + attribute[x] + ": | ");
                for (int y = 0; y < stats[x]; y++){
                    System.out.print("*");
                }
                System.out.print("\n");
            }
            System.out.println("{--------------------------}");
        }
    }
}
