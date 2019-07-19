package Models.Heros;

public  abstract class BaseHero {
    public String _name;
    public String _class;
    public int _level;
    public int _experience;
    public int _attack;
    public int _defense;
    public int _hitpoints;

    // Getters --------------------------------
    public String get_name() {
        return _name;
    }

    public int get_level() {
        return _level;
    }

    public int get_experience() {
        return _experience;
    }

    public int get_attack() {
        return _attack;
    }

    public int get_defense() {
        return _defense;
    }

    public int get_hitpoints() {
        return _hitpoints;
    }

    //Setters -----------------------------

    public void set_name(String _name) {
        this._name = _name;
    }

    public void set_class(String _class) {
        this._class = _class;
    }

    public void set_experience(int _experience) {
        this._experience = _experience;
    }

    public void set_level(int _level) {
        this._level = _level;
    }

    public void set_attack(int _attack) {
        this._attack = _attack;
    }

    public void set_defense(int _defense) {
        this._defense = _defense;
    }

    public void set_hitpoints(int _hitpoints) {
        this._hitpoints = _hitpoints;
    }
}
