package Models.Enemies;

import java.util.Random;

public class EnemyFactory {
    private static String[] enemyList = {"Bat", "DarkFairy", "Dragon", "Goblin", "Rock Giant", "Skeleton", "Troll"};
    public static Villan generateRandomEnemy(){
        Villan enemy = null;
        Random spawnChance = new Random();
        if (((spawnChance.nextInt(10)) == 0)||((spawnChance.nextInt(10)) == 7)){
            Random spawnEnemy = new Random();
            int index = spawnEnemy.nextInt(enemyList.length);
            String type = enemyList[index];
            switch(type){
                case "Bat":
                    enemy = new Villan("Bat Wings", "Bat", 1, 30, 5, 50);
                    break;
                case "DarkFairy":
                    enemy = new Villan("Fairy Dust", "Dark Fairy", 1, 30, 5, 50);
                    break;
                case "Dragon":
                    enemy = new Villan("Dragon Slayer Sword", "Dragon", 1, 30, 5, 50);
                    break;
                case "Goblin":
                    enemy = new Villan("Goblin Potion", "Cave Goblin", 1, 30, 5, 50);
                    break;
                case "Rock Giant":
                    enemy = new Villan("Stone Shield", "Rock Giant", 1, 30, 5, 50);
                    break;
                case "Skeleton":
                    enemy = new Villan("Bone Skull", "Skeleton", 1, 30, 5, 50);
                    break;
                case "Troll":
                    enemy = new Villan("Troll's Club", "Troll", 1, 30, 5, 50);
                    break;
            }
        }
        return enemy;
    }
}
