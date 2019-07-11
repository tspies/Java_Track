package Hanger;

public class Aircraft {
    protected long _id;
    protected String _name;
    protected Coordinates _coordinates;
    private static long idCounter;

    protected Aircraft(String name, Coordinates coordinates)
    {
        this._id = nextId();
        this._name = name;
        this._coordinates = coordinates;
    }

    private long nextId()
    {return idCounter++;}
}
