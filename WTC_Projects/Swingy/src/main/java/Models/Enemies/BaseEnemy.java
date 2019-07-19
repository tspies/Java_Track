package Models.Enemies;

import Models.Heros.BaseHero;

public abstract class BaseEnemy extends BaseHero {
    public String _artifact;

    public String get_artifact() {
        return _artifact;
    }

    public void set_artifact(String _artifact) {
        this._artifact = _artifact;
    }
}
