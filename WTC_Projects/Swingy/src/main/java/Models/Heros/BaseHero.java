package Models.Heros;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

@Getter
@Setter
public  abstract class BaseHero implements Hero{
    public String _name;
    public String _class;
    public int _level;
    public int _experience;
    public int _attack;
    public int _defense;
    public int _hitpoints;

}
