package Controllers;

import Views.StartConsoleGame;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        if (args[0].contains("console") && args.length >= 1){
            StartConsoleGame.startGame();
        }
    }
}
