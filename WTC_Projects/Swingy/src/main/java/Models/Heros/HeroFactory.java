package Models.Heros;

public class HeroFactory {
    public static Hero generateHero(String heroName, String heroClass){
        switch(heroClass.toLowerCase()){
            case "mage":
                return new Hero(heroName, heroClass, 40, 10, 80);
            case "rogue":
                return new Hero(heroName, heroClass, 30, 20, 90);
            case "warrior":
                return new Hero(heroName, heroClass, 20, 30, 120);
            default:
                return null;
        }
    }
}
