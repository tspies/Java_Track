package Controllers.Console;

import Models.Heros.MageHero;
import Models.Heros.RogueHero;
import Models.Heros.WarriorHero;

public class NewGameStats {
    public static Integer[] classStats(String classType){
        Integer[] stats = new Integer[4];
        if (classType.equals("Mage")){
            MageHero hero = new MageHero("name");
            stats[0] = hero.get_attack();
            stats[1] = hero.get_defense();
            stats[2] = hero.get_hitpoints();
        }
        else if (classType.equals("Rogue")){
            RogueHero hero = new RogueHero("name");
            stats[0] = hero.get_attack();
            stats[1] = hero.get_defense();
            stats[2] = hero.get_hitpoints();
        }
        else{
            WarriorHero hero = new WarriorHero("name");
            stats[0] = hero.get_attack();
            stats[1] = hero.get_defense();
            stats[2] = hero.get_hitpoints();
        }
        return  stats;
    }
}
