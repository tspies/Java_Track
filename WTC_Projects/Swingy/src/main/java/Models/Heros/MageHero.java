package Models.Heros;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MageHero extends BaseHero {
    public MageHero(String _name){
        set_name(_name);
        set_class("Mage");
        set_level(1);
        set_experience(0);
        set_attack(40);
        set_defense(10);
        set_hitpoints(80);
    }
}
