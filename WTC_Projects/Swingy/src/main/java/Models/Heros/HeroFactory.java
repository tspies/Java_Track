package Models.Heros;

public class HeroFactory {
    public Hero generateHero(String heroName, String heroClass){
        switch(heroClass){
            case "Mage":
                return new MageHero(heroName);
            case "Rogue":
                return new RogueHero(heroName);
            case "Warrior":
                return new WarriorHero(heroName);
            default:
                return null;
        }
    }
}
