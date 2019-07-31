package Models.Enemies;

public class Villan extends  BaseEnemy{
    public Villan(String _artifact, String _name, int _level, int _attack, int _defense, int _hitpoints){
        set_artifact(_artifact);
        set_name(_name);
        set_level(_level);
        set_attack(_attack);
        set_defense(_defense);
        set_hitpoints(_hitpoints);
    }
}
