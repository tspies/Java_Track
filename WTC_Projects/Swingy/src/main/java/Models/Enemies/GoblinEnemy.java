package Models.Enemies;

public class GoblinEnemy extends BaseEnemy {
    GoblinEnemy(){
        set_name("Goblin");
        set_attack(30);
        set_defense(5);
        set_hitpoints(50);
        set_artifact("Goblin Potion");
    }
}
