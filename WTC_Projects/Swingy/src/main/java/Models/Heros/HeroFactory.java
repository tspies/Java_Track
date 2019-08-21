package Models.Heros;

public class HeroFactory {
    public static Hero generateNewHero(String heroName, String heroClass){
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
    public static Hero generateLoadedHero(String[] heroStats){
        Hero player = new Hero(heroStats[0], heroStats[1], Integer.parseInt(heroStats[4]), Integer.parseInt(heroStats[5]), Integer.parseInt(heroStats[6]));
        player.set_level(Integer.parseInt(heroStats[2]));
        player.set_experience(Double.parseDouble(heroStats[3]));
        return player;
    }
}
