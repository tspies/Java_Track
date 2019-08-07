package Models.Enemies;

import java.util.Random;

public class EnemyFactory {
    private static String[] enemyList = {"Bat", "DarkFairy", "Dragon", "Goblin", "Rock Giant", "Skeleton", "Troll"};
    public static Villan enemy = null;
    public static Villan generateRandomEnemy(){
        Random spawnChance = new Random();
        if ((spawnChance.nextInt(10)) == 0|| (spawnChance.nextInt(10)) == 7){
            Random spawnEnemy = new Random();
            switch(enemyList[spawnEnemy.nextInt(8)]){
                case "Bat":
                    enemy = new Villan("Bat Wings", "Bat", 1, 5, 5, 50);
                case "DarkFairy":
                    enemy = new Villan("Fairy Dust", "Dark Fairy", 1, 5, 5, 50);
                case "Dragon":
                    enemy = new Villan("Dragon Slayer Sword", "Dragon", 1, 5, 5, 50);
                case "Goblin":
                    enemy = new Villan("Goblin Potion", "Cave Goblin", 1, 5, 5, 50);
                case "Rock Giant":
                    enemy = new Villan("Stone Shield", "Rock Giant", 1, 5, 5, 50);
                case "Skeleton":
                    enemy = new Villan("Bone Skull", "Skeleton", 1, 5, 5, 50);
                case "Troll":
                    enemy = new Villan("Troll's Club", "Troll", 1, 5, 5, 50);
                    default:
                        enemy = null;
            }
        }
        return enemy;
    }
}
