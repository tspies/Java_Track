package Models.Heros;


//= Rogue - Mid HP, Low DF, Mid AT
public class RogueHero extends BaseHero {

    public RogueHero(String _name){
        set_name(_name);
        set_class("Rogue");
        set_level(1);
        set_experience(0);
        set_attack(30);
        set_defense(20);
        set_hitpoints(90);
    }
}
