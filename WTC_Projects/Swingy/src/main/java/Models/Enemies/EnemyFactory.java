package Models.Enemies;

import Models.Heros.Hero;

import java.util.Random;

public class EnemyFactory {
    private static String[] enemyList = {"Bat", "Skeleton", "Dark Fairy", "Goblin", "Rock Giant", "Troll", "Dragon"};

    public static Villan generateRandomEnemy(Hero player){
        Villan enemy = null;
        Random spawnChance = new Random();
        int chance = spawnChance.nextInt(21);
        if ((chance == 0)||(chance == 3)||(chance == 9)||(chance == 13)||(chance == 19)){
            Random spawnEnemy = new Random();
            int index = 0;
            if (player.get_level() < 2){
                index = spawnEnemy.nextInt(2);
                String type = enemyList[index];
                switch(type){
                    case "Bat":
                        enemy = new Villan("Bat Wings", "Bat", 1, 30, 5, 100);
                        break;
                    case "Skeleton":
                        enemy = new Villan("Bone Skull", "Skeleton", 1, 15, 5, 100);
                        break;
                }
            }
            else if (player.get_level() < 3){
                index = spawnEnemy.nextInt(4);
                String type = enemyList[index];
                switch(type){
                    case "Bat":
                        enemy = new Villan("Bat Wings", "Bat", 1, 30, 5, 100);
                        break;
                    case "Skeleton":
                        enemy = new Villan("Bone Skull", "Skeleton", 1, 15, 5, 100);
                        break;
                    case "Dark Fairy":
                        enemy = new Villan("Fairy Dust", "Dark Fairy", 2, 30, 8, 200);
                        break;
                    case "Goblin":
                        enemy = new Villan("Goblin Potion", "Cave Goblin", 2, 25, 8, 200);
                        break;
                }
            }
            else if (player.get_level() < 5){
                index = spawnEnemy.nextInt(6);
                String type = enemyList[index];
                switch(type){
                    case "Bat":
                        enemy = new Villan("Bat Wings", "Bat", 1, 30, 5, 100);
                        break;
                    case "Skeleton":
                        enemy = new Villan("Bone Skull", "Skeleton", 1, 15, 5, 100);
                        break;
                    case "Dark Fairy":
                        enemy = new Villan("Fairy Dust", "Dark Fairy", 2, 30, 8, 200);
                        break;
                    case "Goblin":
                        enemy = new Villan("Goblin Potion", "Cave Goblin", 2, 25, 8, 200);
                        break;
                    case "Rock Giant":
                        enemy = new Villan("Stone Shield", "Rock Giant", 3, 40, 40, 350);
                        break;
                    case "Troll":
                        enemy = new Villan("Troll's Club", "Troll", 3, 30, 30, 350);
                        break;
                }
            }
            else if (player.get_level() >= 5){
                index = spawnEnemy.nextInt(enemyList.length);
                String type = enemyList[index];
                switch (type) {
                    case "Bat":
                        enemy = new Villan("Bat Wings", "Bat", 1, 30, 5, 100);
                        break;
                    case "Dark Fairy":
                        enemy = new Villan("Fairy Dust", "Dark Fairy", 2, 30, 8, 200);
                        break;
                    case "Dragon":
                        enemy = new Villan("Dragon Slayer Sword", "Dragon", 4, 60, 55, 500);
                        break;
                    case "Goblin":
                        enemy = new Villan("Goblin Potion", "Cave Goblin", 2, 25, 8, 200);
                        break;
                    case "Rock Giant":
                        enemy = new Villan("Stone Shield", "Rock Giant", 3, 40, 40, 350);
                        break;
                    case "Skeleton":
                        enemy = new Villan("Bone Skull", "Skeleton", 1, 15, 5, 100);
                        break;
                    case "Troll":
                        enemy = new Villan("Troll's Club", "Troll", 3, 30, 30, 350);
                        break;
                }
            }
        }
        return enemy;
    }
}
