package Models.Heros;


//= Rogue - Mid HP, Low DF, Mid AT
public class RogueHero extends BaseHero {

    RogueHero(String _name){
        set_name(_name);
        set_class("Rogue");
        set_level(1);
        set_experience(0);
        set_attack(25);
        set_defense(10);
        set_hitpoints(90);
    }
}
