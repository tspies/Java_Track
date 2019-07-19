package Models.Artifacts;

public abstract class BaseArtifact {
    public int _effect;
    public String _type;

    public void set_effect(int _effect) {
        this._effect = _effect;
    }

    public void set_type(String _type) {
        this._type = _type;
    }

    public int get_effect() {
        return _effect;
    }

    public String get_type() {
        return _type;
    }
}
