package Models.Enemies;

import com.sun.xml.internal.rngom.parse.host.Base;

public class TrollEnemy extends BaseEnemy {
    TrollEnemy(){
        set_name("Troll");
        set_attack(5);
        set_defense(5);
        set_hitpoints(50);
        set_artifact("Troll's Club");
    }
}
