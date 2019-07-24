package Models.Enemies;

import java.util.Random;

public class EnemyFactory {
    private String[] enemyList = {"Bat", "DarkFairy", "Dragon", "Goblin", "Rock Giant", "Skeleton", "Troll"};
    public Villan generateRandomEnemy(){
        Random spawnChance = new Random();
        if ((spawnChance.nextInt(10)) == 0|| (spawnChance.nextInt(10)) == 7){
            Random spawnEnemy = new Random();
            switch(enemyList[spawnEnemy.nextInt(8)]){
                case "Bat":
                    return new BatEnemy();
                case "DarkFairy":
                    return new DarkFairyEnemy();
                case "Dragon":
                    return new DragonEnemy();
                case "Goblin":
                    return new GoblinEnemy();
                case "Rock Giant":
                    return new RockGiantEnemy();
                case "Skeleton":
                    return new SkeletonEnemy();
                case "Troll":
                    return new TrollEnemy();
                    default:
                        return (null);
            }
        }
    }


}
