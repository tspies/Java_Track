package Hanger;

public class Aircraft {
    protected long id;
    protected string name;
    protected Coordinates coordinates;

    private static long idCounter = 0;


    protected long Aircraft(string name, Coordinates coordinates) {

        this.name = name;
        this.idCounter = nextId();
        this.coordinates = coordinates;
    }
    private long nextId() { return this.idCounter++;}
}
