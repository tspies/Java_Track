package Models.Heros;

// = Warrior - High HP, High DF, Low AT

public class WarriorHero extends BaseHero {

    public WarriorHero(String _name){
        set_name(_name);
        set_class("Warrior");
        set_level(1);
        set_experience(0);
        set_attack(20);
        set_defense(30);
        set_hitpoints(120);
    }
}
