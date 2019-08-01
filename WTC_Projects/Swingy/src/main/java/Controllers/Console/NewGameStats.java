package Controllers.Console;

import Models.Heros.MageHero;
import Models.Heros.RogueHero;
import Models.Heros.WarriorHero;

public class NewGameStats {
    static MageHero mage = new MageHero("name");
    static RogueHero rogue = new RogueHero("name");
    static WarriorHero warrior = new WarriorHero("name");
    public static Integer[] classStats(String classType){
        Integer[] stats = new Integer[4];
        if (classType.equals("Mage")){
            stats[0] = mage.get_attack();
            stats[1] = mage.get_defense();
            stats[2] = mage.get_hitpoints();
        }
        else if (classType.equals("Rogue")){
            stats[0] = rogue.get_attack();
            stats[1] = rogue.get_defense();
            stats[2] = rogue.get_hitpoints();
        }
        else{
            stats[0] = warrior.get_attack();
            stats[1] = warrior.get_defense();
            stats[2] = warrior.get_hitpoints();
        }
        return  stats;
    }
}
