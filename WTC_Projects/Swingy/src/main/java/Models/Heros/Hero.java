package Models.Heros;


public class Hero extends BaseHero {
    public Hero(String _name, String heroClass, int atk, int def, int HP){
        set_name(_name);
        set_class(heroClass);
        set_armorArt("empty");
        set_attackArt("empty");
        set_defenseArt("empty");
        set_level(1);
        set_experience(0);
        set_attack(atk);
        set_defense(def);
        set_hitpoints(HP);
    }
}
