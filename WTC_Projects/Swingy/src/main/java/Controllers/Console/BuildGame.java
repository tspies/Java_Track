package Controllers.Console;

import Models.Heros.Hero;
import Models.Heros.HeroFactory;

public class BuildGame {
    public static void newGame(String name, String heroClass){
         Hero player = HeroFactory.generateHero(name, heroClass);
         String[][] map = generateMap(player);
         RunGame.runGameLoop(player, map);

    }
    private static String[][] generateMap(Hero player){
        int buff = ((player.get_level()-1)*5+10-(player.get_level()%2));
        String[][] map = new String[buff][buff];
        // Filling the map will "Walkable" terrain
        for (int i = 0; i < buff; i++){
            for (int j = 0; j < buff; j++){
                map[i][j] = "^";
            }
        }
        // Filling in borders for win condition
        for (int i = 0; i < buff; i++){
            map[0][i] = "#";
            map[buff - 1][i] = "#";
        }
        for (int j = 0; j < buff; j++){
            map[j][0] = "#";
            map[j][buff - 1] = "#";
        }
        initPlayerPos(player, buff);
        return map;
    }
    public static void printMap(int buff, String[][] map){
        System.out.print("\n");
        for (int i = 0; i < buff; i++){
            for (int j = 0; j < buff; j++){
                System.out.print(map[i][j]);
            }
            System.out.print("\n");
        }
    }
    private static void initPlayerPos(Hero player, int buff){
        if ((buff % 2) > 0){
            player.set_xCord(buff/2 + 1);
            player.set_yCord(buff/2 - 1);
        }
        else
        {
            player.set_xCord(buff / 2);
            player.set_yCord(buff / 2);
        }
    }
}