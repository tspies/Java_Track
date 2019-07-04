package Hanger;

public class Coordinates {
    private int longitude;
    private int latitude;
    private int height;

    Coordinates(int longitude, int latitude, int height) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.height = height;
    }
    public int getLongitude() {
        if (this.longitude == 0)
            return (0);
        else
            return this.longitude;
    }

    public int getLatitude() {
        if (this.latitude == 0)
            return (0);
        else
        return this.latitude; }

    public int getHeight() {
        if (this.height == 0)
            return (0);
        else if (height == 100)
            return (100);
        else
            return this.height; }
}
