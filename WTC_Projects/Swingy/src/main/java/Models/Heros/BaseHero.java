package Models.Heros;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public  abstract class BaseHero{
    public String _name;
    public String _class;
    public int _level;
    public int _experience;
    public int _attack;
    public int _defense;
    public int _hitpoints;
    public int _xCord;
    public int _yCord;
    public int _missionBuff;
}
