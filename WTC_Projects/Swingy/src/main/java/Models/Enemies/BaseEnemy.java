package Models.Enemies;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class BaseEnemy {
    public String _artifact;
    public String _name;
    public String _class;
    public int _level;
    public double _experience;
    public int _attack;
    public int _defense;
    public int _hitpoints;
}
