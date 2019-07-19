package Models.Heros;

// = Warrior - High HP, High DF, Low AT

public class WarriorHero extends BaseHero {

    WarriorHero(String _name){
        set_name(_name);
        set_class("Warrior");
        set_level(1);
        set_experience(0);
        set_attack(15);
        set_defense(15);
        set_hitpoints(120);
    }
}
